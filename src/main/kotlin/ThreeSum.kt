fun threeNumberSum(array: MutableList<Int>, targetSum: Int): List<List<Int>> {
    val result = ArrayList<List<Int>>()

    for ((index, i) in array.withIndex()) {
        val cache = HashSet<Int>()

        for (j in index + 1 until array.size) {
            val needed = targetSum - i - array[j];

            if (cache.contains(needed)) {
                result.add(listOf(needed, array[j], i).sorted())
            } else {
                cache.add(array[j])
            }
        }
    }

    return result.sortedWith(compareBy<List<Int>> { it[0] }.thenBy { it[1] }.thenBy { it[2] })
}