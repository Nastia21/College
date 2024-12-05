//Вводится  длина списка. Затем - n элементов списка, каждый
//на новой строке. Напишите программу, которая выводит множество из уникальных элементов в оригинальном порядке
fun main() {
    println("Введите длину списка: ")
    val n = readln()?.toIntOrNull()
    if (n == null || n <= 0) {
        println("Некорректное значение")
        return
    }
    val elements = mutableListOf<String>()
    println("введите $n элементов:")
    for (i in 1..n) {
        val el = readln()
        if (el != null) {
            elements.add(el)
        }
    }
    val unique = LinkedHashSet(elements)
    println("Уникальные элементы: $unique")
    }
