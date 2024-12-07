```kotlin
fun processData(data: String?): Int? {
    return data?.toIntOrNull() ?: 0 //Uses elvis operator and toIntOrNull()
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