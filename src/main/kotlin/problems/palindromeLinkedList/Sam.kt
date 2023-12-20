package problems.palindromeLinkedList

fun main() {
    val a = ListNode(1)
    val b = ListNode(2)
    a.next = b
    val c = ListNode(1)
    b.next = c
    val solution = ListBasedSolution()
    println(solution.isPalindrome(a))
}

class ListBasedSolution {
    fun isPalindrome(head: ListNode?): Boolean {
        if (head == null) return true
        var next: ListNode? = head.next
        val list = mutableListOf<Int>()
        list.add(head.`val`)
        while (next != null) {
            list.add(next.`val`)
            next = next.next
        }
        return list.reversed() == list
    }
}

class TwoPointerTechniqueSolution {

}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
