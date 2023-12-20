package problems.validParentheses

fun main() {
    val valid = ValidParenthesesRecursion()
//    println(valid.isValid("()"))
//    println(valid.isValid("()[]{}"))
//    println(valid.isValid("({[()]})"))
//    println(valid.isValid("({}[]{}[]()[])"))
    println(valid.isValid("(]"))
}

class ValidParenthesesRecursion {
    private var prevLength: Int = 0
    fun isValid(s: String): Boolean {
        if (prevLength == s.length) return false
        prevLength = s.length
        if (s.isEmpty()) return true
        return isValid(s.replace("()", "").replace("{}", "").replace("[]", ""))
    }
}