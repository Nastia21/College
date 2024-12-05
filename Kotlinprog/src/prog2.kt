// проверяет, является ли введенный символ буквой, выводя true или false
fun main() {
println("Введите символ: ")
    val simvol = readln()
    val result: Boolean = if (simvol != null && simvol.length == 1) {
        simvol[0].isLetter()
    } else {
        println("Неккоректное значение")
        false
    }
    if (result) {
        println("true")
    } else {
        println("false")
    }
}