package OopDanSolid

// tidak bisa dibikinan objeknya

abstract class Dosen(){
     abstract fun namaDosen()
     fun jumlahMatkulAjar(){
        println("jumlah matkul yang diajar")
     }

}

class Matkul(): Dosen(){
    override fun namaDosen() {
       println("nama dosen : Andika")
    }
}

fun main(){
//    val dosen = Dosen()
    val matkul = Matkul()
    matkul.namaDosen()
    matkul.jumlahMatkulAjar()

}