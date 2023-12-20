package problems.integerToRoman

fun main() {
    println(intToRoman(1994))
//    println(1994 % 10)
//    println((1994 % 100) / 10)
//    println((1994 % 1000) / 100)
//    println(1994 / 1000)
}

fun intToRoman(num: Int): String {
    val ones = Romans('I', 'V', 'X')
    val tens = Romans('X', 'L', 'C')
    val hundreds = Romans('C', 'D', 'M')
    val thousands = Romans('M', 'C', 'X')
    val first = ones.toRoman(num % 10)
    val second = tens.toRoman((num % 100) / 10)
    val third = hundreds.toRoman((num % 1000) / 100)
    val fourth = thousands.toRoman((num / 1000))
    return "$fourth$third$second$first"
}

private class Romans(private val first: Char, private val second: Char, private val third: Char) {
    fun toRoman(num: Int?): String {
        return when (num) {
            1 -> "$first"
            2 -> "$first$first"
            3 -> "$first$first$first"
            4 -> "$first$second"
            5 -> "$second"
            6 -> "$second$first"
            7 -> "$second$first$first"
            8 -> "$second$first$first$first"
            9 -> "$first$third"
            else -> ""
        }
    }
}
