package leet

class Solution1 {

    /**
     * In an Array of Ints there is exactly one pair that sums up to target
     * This method returns the indices of the pair in O(n) time complexity
     */
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // key is (target - currentNum) value is indexOf(num)
        val numsToSearch = hashMapOf<Int, Int>()
        // Time complexity O(n) moving once through nums
        for ((index, currentNum) in nums.withIndex()) {
            val missingNum = target - currentNum
            if (numsToSearch.containsKey(currentNum)) { // contains is O(1) for hashmap
                // found a pair
                return intArrayOf(numsToSearch[currentNum]!!, index)
            } else {
                numsToSearch[missingNum] = index // put is O(1) for Hashmap
            }
        }
        return intArrayOf(0,0) // no solution found should never hit since solution is guaranteed
    }
}