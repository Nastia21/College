// Вводится число, программа должна выводит удвоенные числа от 1 до n (обе границы не включены в диапозон)
    fun main(){
        println("Введите число:")
        val n = readln().toIntOrNull()
    if (n != null) {
        for (i in 2..n - 1)
            println(i * 2)
        }else{
            println("Неккоректный ввод")
        }
    }