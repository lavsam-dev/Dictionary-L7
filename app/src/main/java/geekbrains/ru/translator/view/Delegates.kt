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
        // car code
    }
}

open class Boat : IBoat {
    override fun swim() {
        // boat code
    }
}

open class Duck : IDuck {
    override fun krya() {
        // krya code
    }

    override fun swim() {
        // swim code
    }
}

class Monster(
    private val car: Car,
    private val boat: Boat,
    private val duck: Duck
) : Icar, IBoat, IDuck {
    override fun drive() {
        // car code
    }

    override fun krya() {
        // krya code
    }

    override fun swim() {
        // boat code
    }
}