// Constructor in Car class
class Car(_carName: String, _typeCar: String) {
    var carName = _carName.capitalize()
    var typeCar = _typeCar

    // Getter and Setter
    get() = field
    set(value) {
        field = value
    }

    // Initializer Block
    init {
        println("Nama Mobil = $carName")
        println("Type Mobil = $typeCar")
    }
}

fun main() {
    // List Car
    val carNamelist = arrayListOf("BMW", "Mercedes Benz", "Lamborgini", "Ferrari", "Mazda")
    val carTypelist = arrayListOf("Sport", "Classic")

    // Memanggil constructor pada class Car
    println("---- Deskripsi Mobil ----")
    val car1 = Car(carNamelist[0], carTypelist[0])
    println("-------------------------")
}