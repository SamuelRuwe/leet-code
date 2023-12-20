package problems.longestCommonPrefix

fun longestCommonPrefix(strs: Array<String>): String {
    var result = strs[0]
    while (!strs.all { it.startsWith(result) }) {
        result = result.substring(0, result.length - 1)
    }
    return result
}
