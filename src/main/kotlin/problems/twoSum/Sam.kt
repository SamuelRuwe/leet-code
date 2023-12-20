package problems.twoSum

fun main() {
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val nextArray = nums.sorted()
    var firstIndex = 0
    var lastIndex = nextArray.lastIndex

    while (nextArray[firstIndex] + nextArray[lastIndex] != target) {
        if (nextArray[firstIndex] + nextArray[lastIndex] > target) {
            lastIndex--
        } else if (nextArray[firstIndex] + nextArray[lastIndex] < target) {
            firstIndex++
        } else
            return intArrayOf(nextArray[firstIndex], nextArray[lastIndex])
    }
    return intArrayOf()
}
