package problems.searchInsertPosition

fun main() {
    val input = intArrayOf(1, 3, 5, 6)
    val target = 7
    println(SamSolution().searchInsert(input, target))
}

class SamSolution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return if (nums[0] > target) 0 else 1

        val middle = nums[nums.size % 2]
        if (middle == target) return nums.indexOf(middle)

        if (middle > target) {
            return searchInsert(nums.sliceArray(IntRange(0, nums.indexOf(middle))), target)
        }

        return nums.indexOf(middle) + 1 + searchInsert(
            nums.sliceArray(IntRange(nums.indexOf(middle), nums.size - 1)), target
        )
    }
}
