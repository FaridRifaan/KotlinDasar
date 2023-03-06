fun main(){
//    val rumahA = Rumah()
//    println("nama pemilik rumah: ${rumahA.namaPemilik}" )
//    println("Salah satu fungsi rumah: ${rumahA.tahanPanas()}")

//    val rumahB = Rumah()
//    rumahB.namaPemilik = "Andika"
//    println(rumahB.namaPemilik)


 contohLambdaFun()
    val sum = {a: Int, b: Int-> a+b }
    val sub = {a: Int, b: Int-> a-b}

    val hitungSum = calculate(12, 14, sum)
    val hitungSub = calculate(13, 10, sub)
    println("hasil penjumlahan: $hitungSum")
    println("hasil pengurangan: $hitungSub")
}

fun contohLambdaFun(){
    val ucapanUltah = {name: String -> "Happy birthday $name"}
    val ucapan1 = ucapanUltah("heru")
    println(ucapan1)

}
fun higherOrderFun(){

}

fun calculate(a: Int, b: Int, operation:(Int, Int)->Int):Int{
    return operation(a,b)
}
