package arrays

fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
    val set = HashSet<Int>()

    for (num in array) {
        val needed = targetSum - num

        if (set.contains(needed)) {
            return listOf(num, needed)
        }

        set.add(num)
    }

    return listOf<Int>()
}