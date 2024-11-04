fun main() {

    //Задача 1
    val array = arrayOf(2, 4, 7, 1, 2, 4)
    println("Пример работы решения задачи 1: " + getEntrances(array))

    //Задача 2
    val people = mutableMapOf(1 to "Иван", 2 to "Петр",3 to "Лида", 4 to "Петр", 5 to "Анна")
    println("Решение для задачи 2: ")
    removeAllByInput(people)
    println(people)

    //Задача 3
    val personHashMap = hashMapOf(
        Pair(1, Person("Иван", 19, "Менеджер")),
        Pair(2, Person("Сергей", 25, "Разработчик")),
        Pair(3, Person("Анатолий", 29, "Старший разработчик")),
        Pair(4, Person("Антон", 23, "Разработчик")),
        Pair(5, Person("Виктор", 33, "Руководитель"))
    )
    println("Ответ к задаче 3: ")
    personHashMap.forEach { println(it) }
}

//Функция для задачи 1
fun <K> getEntrances(array: Array<K>): Map<K, Int> {
    val map = mutableMapOf<K, Int>()
    for (i in array.indices) {
        if (map.contains(array[i])) continue
        var count = 0
        for (j in i..<array.size) if (array[i] == array[j]) count++
        map[array[i]] = count
    }
    return map
}

//Функция для задачи 2
fun removeAllByInput(map: MutableMap<Int, String>) {
    println("Введите значение которое хотите удалить из коллекции: ")
    val input = readln()
    val list = mutableListOf<Int>()
    map.forEach { (key, value) -> if (value == input) list.add(key) }
    list.forEach { map.remove(it) }
}

//Класс для задачи 3
data class Person(val name: String, val age: Int, val position: String)