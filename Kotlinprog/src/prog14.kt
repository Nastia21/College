//вводится число, после него вводится число элементов массива. Программа создаёт массив из этих чисел и проверяет,
//содержится ли в нем заданное число. Если число есть - выведите в консоль true, иначе - false
fun main(){
    println("Введите число для проверки:")
    val num = readln().toIntOrNull()
    println("Введите кол-во элементов массива:")
    val size = readln().toIntOrNull()
    if (num != null) {
        println("Введите $size элементов массива:")
        val input = readlnOrNull()
        val array = mutableListOf<Int>()
        for (i in 1..size!!)
     //   val result: Boolean = num in array
  //  } else {
        println("Некорректный ввод")
        return        }
}
//