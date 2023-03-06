package OopDanSolid

fun main(){
    val buah = Buah()
        buah.deskripsi("Apel", "a")
}
class Buah(){
    fun deskripsi(name : String){
        println("nama buah: $name")
    }
    fun deskripsi(warna: String, vitamin: String){

    }
}