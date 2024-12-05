//получает на вход 5 строк и выводит объединённые строки
fun main() {
    var result = ""
    println("Введите 5 строк: ")
    repeat(5){
        val input = readln()
        if (input != null) {
            result += input
        } else {
            println("Пустой ввод")
        }
    println("Объедененные строки - $result")
}}