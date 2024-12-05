//На вход программе подаётся число n и n элементов первого множества,
//каждый на новой строке. Затем число m и m элементов второго
//множества, каждый на новой строке. Напишите программу, которая
//создаёт два множества из данных элементов и возвращает их общие элементы
fun main() {
    println("Введите кол-во элементов первого множества:")
    val n = readln()?.toIntOrNull()
    if (n == null || n <= 0) {
        print("Некорректное значение")
        return
    }
    val set1 = mutableSetOf<String>()
    println("Введите $n элементов для первого множества")
    for (i in 1..n) {
        val element = readln()
        if (element != null){
            set1.add(element)
        }
    }
    println("Введите кол-во элементов второго множества:")
    val m = readln()?.toIntOrNull()
    if (m == null || m <= 0) {
        print("Некорректное значение")
        return //  выходим из программы - нет смысла работать с null/0 кол-вом элементов
    }
    val set2 = mutableSetOf<String>()
    println("Введите $m элементов для второго множества:")
    for (i in 1..m) {
        val element = readln()
        if (element != null){
            set2.add(element)
        }
    }
    val itersectMnoj = set1 intersect set2

    if (itersectMnoj.isNotEmpty()){
        println("$itersectMnoj")
    } else {
        println("Нет общих элементов")
    }
}
