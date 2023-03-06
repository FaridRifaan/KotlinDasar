package LatihanOop

open class Vehicle(var brand: String, var color: String){

}

class Car(): Vehicle("yamaha", "merah"){
    fun drive(): String{
        return "Driving $brand warna: $color"
    }
}

class Motorcyle(): Vehicle("Honda", "Kuning"){
    fun drive():String{
        return "Driving $brand warna: $color"
    }

}

fun main(){
    val mobil = Car()
    val motor = Motorcyle()
    println(mobil.drive())
    println(motor.drive())
}