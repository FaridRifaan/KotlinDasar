package OopDanSolid

open class Animal (){
    open fun deskripsi(){
        println("Deskripsi Hewan")
    }
    open fun namaAnimal(nama : String){
        println("nama binatan: $nama")
    }

}

open class Harimau(): Animal(){
    override fun deskripsi() {
        super.deskripsi()
    }

    override fun namaAnimal(nama: String) {
        super.namaAnimal(nama)
    }
    fun warnaKulit(){

    }
}

class Gajah(): Animal(){
    override fun deskripsi() {
        super.deskripsi()
    }
}

class HarimauSumatra(): Harimau(){
    override fun deskripsi() {
        super.deskripsi()
    }
}
