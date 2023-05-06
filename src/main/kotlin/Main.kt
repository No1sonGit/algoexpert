import arrays.isValidSubsequence

fun main(args: Array<String>) {
    val array = listOf(5, 1, 22, 25, 6, -1, 8, 10)
    val sequence = listOf(1, 6, -1, 10)

    isValidSubsequence(array, sequence)
}