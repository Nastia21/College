//считывает символ в нижнем регистре, преобразовывает его в верхний, а затем выводит код Unicode нового символа
    fun main() {
        println("Введите символ в нижнем регистре: ")
        val char = readln().firstOrNull()
        if (char != null && char.isLowerCase()) {
            val upperchar = char.uppercaseChar()
            val unicode = upperchar.code
            println("$unicode")
        } else {
            println("Введено неккоректное значение")
        }
    }