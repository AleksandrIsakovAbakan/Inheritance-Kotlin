fun main() {

    /*
    Создать суперкласс Animal(животное) со свойствами веса и имени.
    Написать функцию, которая описывает прием пищи животного.
    Наследовать от него подклассы Dog, Cat, используя все возможности суперкласса.
    У каждого животного определить по одной своейфункции.
    */
    val dog = Dog()
    dog.name = "Rocky"
    dog.weight = 5
    println(dog)
    dog.animalEats()
    dog.theDogBarks()
    val cat = Cat()
    cat.name = "Misty"
    cat.weight = 2
    println(cat)
    cat.animalEats()
    cat.theCatMeows()
    println()

    /*
    Создать классы Nokia и Sony.
    Наследовать каждый из них от суперклассов Smartphone и IPhone.
    Создать несколько свойств в суперклассах и функцию звонка.
    */
    val nokia = Nokia()
    nokia.weight = 0.2
    nokia.screenDiagonal = 5
    nokia.screenResolution = 1080
    nokia.style = false
    println(nokia)
    nokia.phoneIsRinging()
    val sony = Sony()
    sony.weight = 0.3
    sony.screenDiagonal = 6
    sony.screenResolution = 1080
    sony.style = true
    println(sony)
    sony.phoneIsRinging()
    println()

    val array = intArrayOf(3, 67, 1, 55, 65, 89, 23)
    println(array.contentToString())
    println("Вывести на экран элементы массива, которые делятся на 5 на цело:")
    arrayElementsThatAreDivisibleBy5ByInteger(array)
    println()
}

/*
Дан массив целых чисел 3, 67, 1, 55, 65, 89, 23.
Вывести на экран элементы массива, которые делятся на 5 на цело.
*/
fun arrayElementsThatAreDivisibleBy5ByInteger(array: IntArray) = array.forEach { if (it % 5 == 0) println(it) }

/*
Примечания:
Для вывода значений на экран используйте функцию println().
*/