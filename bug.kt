```kotlin
fun processData(data: String?): Int {
    if (data == null) return 0 // Handle null case
    try {
        return data.toInt() // Potential NumberFormatException
    } catch (e: NumberFormatException) {
        println("Invalid input: $data")
        return -1 // Indicate an error
    }
}

fun main() {
    val result1 = processData("123")
    val result2 = processData("abc")
    val result3 = processData(null)
    println("Result 1: $result1")
    println("Result 2: $result2")
    println("Result 3: $result3")
}
```