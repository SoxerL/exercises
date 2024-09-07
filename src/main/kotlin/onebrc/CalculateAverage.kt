package onebrc

import java.io.File
import java.util.concurrent.TimeUnit
import kotlin.system.measureTimeMillis

/**
 * This is a kotlin solution for the "One Billion Row Challenge" by gunnar morling See: https://github.com/gunnarmorling/1brc
 * The official challenge was in Java and has the following constraints
 * Quote: The task is to write a Java program which reads the file,
 * calculates the min, mean, and max temperature value per weather station,
 * and emits the results on stdout like this (i.e. sorted alphabetically by station name,
 * and the result values per station in the format <min>/<mean>/<max>, rounded to one fractional digit)
 */
class CalculateAverage {
    fun run(fileName: String): File {
        return calculateBasic(fileName)
    }

    /**
     * Times for running locally on my machine:
     * 1k   calculateBasic took 00:00:033
     * 10k  calculateBasic took 00:00:014
     * 100k calculateBasic took 00:00:035
     * 1m   calculateBasic took 00:00:145
     * 10m  calculateBasic took 00:01:198
     * 100m calculateBasic took 00:11:371
     * 1b   calculateBasic took 01:46:600
     * The first time is most likely inacurate due to startup of the whole project
     */
    private fun calculateBasic(fileName: String): File {

        val result = File("resBasic")
        val timeTaken = measureTimeMillis {
            // read input
            // map has format station --> list(min, max, sum, #processed)
            val stations: MutableMap<String, MutableList<Double>> = mutableMapOf()

            this::class.java.classLoader.getResourceAsStream(fileName)!!.bufferedReader().forEachLine {
                val data = it.split(";")
                val station = data[0]
                val newTemp = data[1].toDouble()
                if (stations.containsKey(station)) {
                    val currentValues = stations[station]!!
                    val currentMin = currentValues[0]
                    val currentMax = currentValues[1]
                    val currentSum = currentValues[2]
                    if (currentMin > newTemp) {
                        currentValues[0] = newTemp
                    } else if (currentMax < newTemp) {
                        currentValues[1] = newTemp
                    }
                    currentValues[2] = currentSum + newTemp
                    currentValues[3] += 1.toDouble()
                    stations[station] = currentValues
                } else {
                    stations[station] = mutableListOf(newTemp, newTemp, newTemp, 1.toDouble())
                }
            }

            // create output
            result.writeText("{")
            for ((index, station) in stations.keys.sorted().withIndex()) {
                val data = stations[station]
                val min = data?.get(0)!!
                val max = data[1]
                // this is needed to adhere to the roundup principle used by the author
                val mean = Math.round((Math.round(data[2] * 10.0) / 10.0) / data[3].toLong() * 10.0) / 10.0

                result.appendText(String.format("%s=%.1f/%.1f/%.1f", station, min, mean, max))
                if (index < stations.keys.size - 1) {
                    result.appendText(", ")
                }
            }
            result.appendText("}\n")
        }
        println("calculateBasic took ${convertMillisToHumanReadable(timeTaken)}")
        return result
    }

    /**
     * Converts milliseconds into the format Minutes:Seconds:Milliseconds (mm:ss:SSS)
     */
    private fun convertMillisToHumanReadable(milliSeconds: Long): String {
        return String.format(
            "%02d:%02d:%03d",
            TimeUnit.MILLISECONDS.toMinutes(milliSeconds) % 60L,
            TimeUnit.MILLISECONDS.toSeconds(milliSeconds) % 60L,
            milliSeconds % 1000L
        )
    }
}