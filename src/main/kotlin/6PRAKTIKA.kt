import kotlin.random.Random

fun Array (array: IntArray): Double { 
    var scam = 0;
    var count = 0;
    for (element in array) {
        if (element % 2 != 0) {
            scam += element
            count++
        }
    }
    return scam.toDouble() / count
}

fun main (array: Array<String>) { 
    val array = IntArray(25)
    for (i in array.indices) {
        array[i] = Random.nextInt(0,25)
    }
    println("Array: ${array.joinToString()}")
    println("Element: ${Array(array)}")
}
