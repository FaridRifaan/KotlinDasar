class Rumah {
    var panjangRumah : Int = 100
    var lebarRumah : Int = 50
    var luasTanah : Int = 100
    var namaPemilik: String = "Jihan"
    var warnaRumah: String = "Kuning"


    constructor(_panjangRumah: Int, _lebarRumah: Int, _namaPemilik: String){
        this.panjangRumah = _panjangRumah
        this.lebarRumah = _lebarRumah
        this.namaPemilik = _namaPemilik
    }

    fun hidupkanLampu():String{
        return "Rumah bisa menghidupkan lampu"
    }
    fun naikTurunLift():String{
        return "Bisa naik turun menggunakan Lift"
    }

    fun tahanPanas():String{
        return "Rumah nya tahan panas"
    }


}