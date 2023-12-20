package problems.validParentheses

fun main() {
    val valid = ValidParentheses()
    println(valid.isValid("()"))
}

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val dequeue = ArrayDeque<Char>()
        for (c in s) {
            if (c == '(') dequeue.addLast(c)
            if (c == '{') dequeue.addLast(c)
            if (c == '[') dequeue.addLast(c)
            if (c == ')') {
                if (dequeue.removeLastOrNull() != '(') return false
            }
            if (c == '}') {
                if (dequeue.removeLastOrNull() != '{') return false
            }
            if (c == ']') {
                if (dequeue.removeLastOrNull() != '[') return false
            }
        }
        return dequeue.isEmpty()
    }
}
