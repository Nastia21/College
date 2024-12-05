//преобразует два введённых символа в Unicode и выводит их разность
fun main(){
    println("Введите первый символ:")
    val input1 = readln()
    val char1: Char = if (input1 != null && input1.length == 1){
        input1[0].toChar()
    } else {
        println("Неккоректный ввод")
        return
    }
    println("Введите второй символ: ")
    val input2 = readln()
    val char2: Char = if (input2 != null && input2.length == 1){
        input2[0].toChar()
    } else {
        println("Неккоректный ввод")
        return
    }
    val unicode1 = char1.code
    val unicode2 = char2.code
    val diff = (unicode1 - unicode2)
        println("Разность: $diff")
    }



