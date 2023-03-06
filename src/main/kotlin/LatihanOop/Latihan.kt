package LatihanOop

private class Orang(var name : String, var age:Int){
 fun introduce (){
        println("Hi, my Name $name and I am $age years old.")

    }
}

fun main(){
    val person = Orang("Fard", 21)
    person.introduce()
}





