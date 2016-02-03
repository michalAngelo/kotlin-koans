package syntax.forWhileLoops

fun forLoop(collection: Collection<String>) {
    val list = collection.toArrayList()
    for (i in 1..10) {
        System.out.println(list.get(i))
    }
    System.out.println("\n\n")
    for (s in collection) {
        System.out.println(s)
    }

    System.out.println("\n\n")
    for ((index, s) in collection.withIndex()) {
        System.out.println(s + "  index: " + index)
    }
}

fun iteratingOverMap(map: Map<Int, String>) {
    System.out.println("\n\n")
    for ((key, value) in map) {
        System.out.print(key.toInt())
        System.out.println(": " + value)
    }
}

fun whileLoop() {
    while (true) {
    }
}

fun doWhileLoop() {
    do {

    } while (true)
}

fun labels() {
    outerLoop@ while (true) {
        innerLoop@ for (i in 1..10) {
            if (i < 10) {
                continue@innerLoop
            } else {
                break@outerLoop
            }
        }
    }
}

