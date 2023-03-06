package LatihanOop

open class Person(var name: String = "Farid", val age: Int = 21){

}

class Student(): Person(){
    var kelas: String = "Android kotlin"
    val nilai: Int = 90
        fun getDetail(): String{
            return "nama: $name, umur: $age, kelas: $kelas, score: $nilai"
        }
}

fun main(){
    val siswa = Student()
    println(siswa.getDetail())

}

