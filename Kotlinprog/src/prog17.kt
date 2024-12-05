// На вход программе подаётся число  элементов первого множества.
//Затем число второго множества. Напишите программу, которая создаёт
//два множества из данных элементов и возвращает их объединение
fun main(){
    println("Введите кол-во элементов первого множества: ")
    val n1 = readln()?.toIntOrNull()
    if (n1 == null || n1 <= 0) {
        print("Некорректное значение")
        return
    }
    val set1 = mutableSetOf<String>()
    println("Введите $n1 элементов для первого множества: ")
    for (i in 1..n1) {
        val element = readln()
        if (element != null){
            set1.add(element)
        }
    }
    println("Введите кол-во элементов второго множества: ")
    val n2 = readln()?.toIntOrNull()
    if (n2 == null || n2 <= 0) {
        println("Некорректное значение")
        return
    }
    val set2 = mutableSetOf<String>()
    println("Введите $n2 элементов для второго множества: ")
    for (i in 1..n2) {
        val element = readln()
        if (element != null){
            set2.add(element)
        }
    }
    val unionMnoj = set1 union set2
        println("$unionMnoj")
}