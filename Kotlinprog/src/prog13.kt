//Реализовать обратный отсчет до старта, пользователь вводит число. Должна быть проверка.
    fun main(){
        println("Введите точку отсчёта:")
        val num = readln().toIntOrNull()
    if (num != null) {
        for (i in num downTo  0){
            println(i)
        }
    }
    }