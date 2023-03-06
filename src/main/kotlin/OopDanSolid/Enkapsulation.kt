package OopDanSolid
// public - private - protected - internal
open class Mahasiswa{
 var name: String = "Dwiki"
    private var age : Int = 21
    protected var address : String = "Depok"
    internal var nim: String = "8473661"



}

class AndroidClass(): Mahasiswa(){
    var andclass = address

//    override var address: String
//        get() = super.address
//        set(value) {}

}


fun main(){
    val mhs = Mahasiswa()
    println("Nim: ${mhs.nim}")

    val apaJadah = AndroidClass()
    println(apaJadah.andclass)
    val fsw = FswClass()
    fsw.exPublic()
    fsw.exInternal() // method

}
class FswClass(){
     fun exPublic(){

    }
    private fun exPrivate(){

    }
    protected fun exProtected(){

    }
    internal fun exInternal(){

    }
}

private class myClass(){

}

internal class myClass4(){

}