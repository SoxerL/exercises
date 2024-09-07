package onebrc

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import java.io.File
import java.nio.file.Files
import kotlin.test.assertContentEquals

/**
 * Due to size only the small testfiles are added to git.
 * Bigger files can be created by using the methods from the original git: https://github.com/gunnarmorling/1brc
 */
class CalculateAverageTest {

    private val sol = CalculateAverage()

    @Test
    fun testCalculationSmallInputs() {
        // 1 thousand rows
        val expected1k = File(this::class.java.classLoader.getResource("average1k.txt")!!.toURI())
        val actual1k = sol.run("measurements1k.txt")
        assertContentEquals(Files.readAllBytes(expected1k.toPath()), Files.readAllBytes(actual1k.toPath()))

        // 10 thousand rows
        val expected10k = File(this::class.java.classLoader.getResource("average10k.txt")!!.toURI())
        val actual10k = sol.run("measurements10k.txt")
        assertContentEquals(Files.readAllBytes(expected10k.toPath()), Files.readAllBytes(actual10k.toPath()))

        // 100 thousand rows
        val expected100k = File(this::class.java.classLoader.getResource("average100k.txt")!!.toURI())
        val actual100k = sol.run("measurements100k.txt")
        assertContentEquals(Files.readAllBytes(expected100k.toPath()), Files.readAllBytes(actual100k.toPath()))
    }

    @Disabled("Disabled since the files are not part of the repository and have to be generated first")
    @Test
    fun testCalculationBigInputs() {
        // 1 million rows
        val expected1m = File(this::class.java.classLoader.getResource("average1m.txt")!!.toURI())
        val actual1m = sol.run("measurements1m.txt")
        assertContentEquals(Files.readAllBytes(expected1m.toPath()), Files.readAllBytes(actual1m.toPath()))

        // 10 million rows
        val expected10m = File(this::class.java.classLoader.getResource("average10m.txt")!!.toURI())
        val actual10m = sol.run("measurements10m.txt")
        assertContentEquals(Files.readAllBytes(expected10m.toPath()), Files.readAllBytes(actual10m.toPath()))

        // 100 million rows
        val expected100m = File(this::class.java.classLoader.getResource("average100m.txt")!!.toURI())
        val actual100m = sol.run("measurements100m.txt")
        assertContentEquals(Files.readAllBytes(expected100m.toPath()), Files.readAllBytes(actual100m.toPath()))

        // 1b rows
        val expected1b = File(this::class.java.classLoader.getResource("average1b.txt")!!.toURI())
        val actual1b = sol.run("measurements1b.txt")
        assertContentEquals(Files.readAllBytes(expected1b.toPath()), Files.readAllBytes(actual1b.toPath()))
    }
}