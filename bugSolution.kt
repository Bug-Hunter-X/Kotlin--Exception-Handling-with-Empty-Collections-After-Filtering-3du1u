```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers.size)
    println(evenNumbers.sumOrNull() ?: 0) //Safe call and elvis operator
    
    val emptyList = listOf<Int>()
    val emptyEvenNumbers = emptyList.filter { it % 2 == 0 }
    println(emptyEvenNumbers.size) //0
    println(emptyEvenNumbers.sumOrNull() ?: 0) //0
}
```