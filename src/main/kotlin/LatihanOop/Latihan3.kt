package LatihanOop


fun main() {
    val namaHewan = Animal("Kucing", "Miaw")
    println(namaHewan.soundAnimal())
}

open class Animal(var nama: String, var sound:String){
        fun soundAnimal(): String{
            return "$nama $sound"
        }
}





//fun main() {
//    val namaHewan = Animal("Kucing", "Miaw")
//    namaHewan.soundAnimal()
//}
//
//open class Animal(var nama: String, var sound:String){
//    fun soundAnimal(){
//        println("$nama $sound")
//    }
//}
