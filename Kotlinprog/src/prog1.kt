//находит среднее арифметическое трёх введённых чисел с плавающей точкой
fun main() {
    println("Введите 3 числа c плавающей точкой: ")
    val num1 = readln().toDouble()
    val num2 = readln().toDouble()
    val num3 = readln().toDouble()
    val sum = num1 + num2 + num3
    val avg = sum / 3
        println("Среднее арифметическое - $avg")
    }






