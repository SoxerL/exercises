package leet

class Solution26 {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var lastSeen = nums[0]
        var indicesToMove = 0
        for (i in 1 until nums.size) {
            if (lastSeen == nums[i]) {
                ++indicesToMove
            } else {
                lastSeen = nums[i]
                nums[i - indicesToMove] = nums[i]
            }
        }
        return nums.size - indicesToMove
    }

    /**
     * This Solution is slightly better as it uses fewer checks and fewer additional variables
     * Technically both solutions run in O(n) Time Complexity
     */
    fun removeDuplicateAlt(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var actualIndex = 1
        for (i in 0 until nums.size - 1) {
            if (nums[i] < nums[i + 1]) {
                nums[actualIndex] = nums[i + 1]
                actualIndex++
            }
        }
        return actualIndex
    }
}