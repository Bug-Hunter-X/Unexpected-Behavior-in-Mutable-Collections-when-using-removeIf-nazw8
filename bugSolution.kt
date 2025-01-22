fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    for (element in list) {
        if (element % 2 == 0) {
            toRemove.add(element)
        }
    }
    list.removeAll(toRemove)
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val toRemoveMap = mutableListOf<Map.Entry<String,Int>>()
    for (entry in map.entries) {
        if (entry.value % 2 == 0) {
            toRemoveMap.add(entry)
        }
    }
    toRemoveMap.forEach{map.remove(it.key)}
    println(map) // Output: {a=1, c=3}
} 