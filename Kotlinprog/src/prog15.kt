//Вводится длина массива. Затем вводится длина для нового массива. Напишите программу, которая создаёт массив из этих чисел и
//выводит их новый массив, содержащий все те же числа, но в обратном порядке
fun main() {
    println("Введите длину массива:")
    val length = readln().toIntOrNull()
    if (length == null || length <= 0) {
        println("Некорректный ввод")
        return
    }
    println("Введите $length элементов массива:")
    val input = mutableListOf<String>()
    repeat(length) {
        val element = readlnOrNull()
        if (element != null) {
            input.add(element)
        }
    }
    val result = linkedSetOf<String>().reversed()
    result.addAll(input)
    println("$result")
}