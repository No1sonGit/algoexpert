fun isValidSubsequence(array: List<Int>, sequence: List<Int>): Boolean {
    var index = 0;

    for (value in array) {
        if (value == sequence[index]) {
            index++
        }

        if (index == sequence.size) return true
    }

    return false
}