package leet

class Solution14 {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 1){
            return strs.first()
        }
        val common = strs[0]
        var index = 0
        while (index < common.length) {
            val currentChar = common[index]
            for (s in strs) {
                if (index >= s.length) {
                    return common.substring(0, index)
                }
                if (currentChar != s[index]){
                    return common.substring(0, index)
                }
            }
            ++index
        }
        return common
    }
}