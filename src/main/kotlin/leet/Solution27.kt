package leet

class Solution27 {

    fun removeElement(nums: IntArray, value: Int): Int {
        if (nums.isEmpty()) return 0
        var actualIndex = 0
        for (i in nums.indices) {
            if (nums[i] != value) {
                nums[actualIndex] = nums[i]
                ++actualIndex
            }
        }
        return actualIndex
    }
}