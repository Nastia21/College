//Напишите программу, которая принимает элементы списка через
//запятую и возвращает Map, где ключи - уникальные элементы списка, а
//значения - количество раз, которое каждый элемент встречается в списке
fun main() {
    println("Введите элементы списка через запятую:")
    val input = readln()
    if (input.isNullOrEmpty()){
        println("Строка пустая")
        return
    }
    val elements = input.split(",").map {it.trim()}
    val elementCount = elements.groupingBy {it}.eachCount()
    println("Словарь уникальных элементов и их кол-ва:")
    for ((element, count) in elementCount) {
        println("$element - $count раз(а)")
    }
}
