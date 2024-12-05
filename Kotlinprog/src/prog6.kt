// Вводится строка, программа, удаляет из нее первые два элемента и вставляет их в конец
    fun main(){
        println("Введите строку: ")
        val string = readln()
    if (string.length < 2){
        println("Введите минимум 2 символа")
    }
    val modif = string.drop(2) + string.take(2)
        println("$modif")
    }
