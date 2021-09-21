package geekbrains.ru.translator.view

interface Icar {
    fun drive()
}

interface IBoat {
    fun swim()
}

interface IDuck {
    fun krya()

    fun swim()
}

open class Car : Icar {
    override fun drive() {

    }
}

open class Boat : IBoat {
    override fun swim() {

    }
}

open class Duck : IDuck {
    override fun krya() {

    }

    override fun swim() {

    }
}