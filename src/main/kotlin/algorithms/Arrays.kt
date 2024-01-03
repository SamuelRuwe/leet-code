package algorithms

private fun findMaxValue(doubleArray: DoubleArray): Double {
    var max = doubleArray[0]
    for (element in doubleArray) {
        if (element > max) {
            max = element
        }
    }
    return max
}

private fun computeAverage(doubleArray: DoubleArray) : Double {
    var sum = 0.0
    for (element in doubleArray) {
        sum += element
    }
    return sum / doubleArray.size
}

private fun copyToNewArray(doubleArray: DoubleArray) : DoubleArray {
    return DoubleArray(doubleArray.size).also {
        for ((index, value) in doubleArray.withIndex()) {
            it[index] = value
        }
    }
}

private fun reverseElementsInArray(doubleArray: DoubleArray) : DoubleArray {
    val n = doubleArray.size / 2
    for (i in 0..n) {
        val temp = doubleArray[i]
        doubleArray[i] = doubleArray[n - i - 1]
        doubleArray[n - i - 1] = temp
    }
    return doubleArray
}

private fun multiplyMatrices(matrix1: Array<Array<Int>>, matrix2: Array<Array<Int>>): Array<Array<Int>> {
    val row1 = matrix1.size
    val col1 = matrix1[0].size
    val col2 = matrix2[0].size
    val product = Array(row1) { Array(col2) { 0 } }

    for (i in 0..<row1) {
        for (j in 0..<col2) {
            for (k in 0..<col1) {
                product[i][j] += matrix1[i][k] * matrix2[k][j]
            }
        }
    }

    return product
}
