// Создайте с помощью mapOf и выведите словарь, в котором ключами
//являются дни недели, а значениями их номера (Понедельник - 1, Вторник - 2 и т. д.)
fun main() {
    val daysToNum = mapOf(
        "ПН" to 1,
        "ВТ" to 2,
        "СР" to 3,
        "ЧТ" to 4,
        "ПТ" to 5,
        "СБ" to 6,
        "ВС" to 7
    )
    println("Дни недели и их номера:")
    for ((day, number) in daysToNum) {
        println("$day - $number")
    }
}
