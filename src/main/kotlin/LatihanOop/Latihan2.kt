package LatihanOop

class Rectangle(val width: Int, val height: Int){
        fun getArea(): Int{
            return height * width
        }
}

fun main(){
    val rect = Rectangle(5,3)
//    println(rect.getArea()) // cara memanggil angka nya langsung
    val area = rect.getArea()
    println("luas kotak : $area")

}
