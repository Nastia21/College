// реализовать программу которая безопасно вызовет свойство length на строке и выведет результат, если строка не null
    fun main() {
        println("Введите строку: ")
    val string: String? = readln()
        if (string.isNullOrEmpty()) {
            println("Строка равна 0 или пустая")
        } else {
            val length = string.length
            println("$length")
        }
    }