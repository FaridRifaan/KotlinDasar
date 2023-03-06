fun main() {
    val score: Int = 51
    print("Masukan Score: ")
    val inputScore: Int = readLine()!!.toInt()
//    val inputScore: Int = readLine()?.toInt()?:0

    if (inputScore >= 50 ){
        println("lulus")
    }else if  (inputScore <= 50 ){
        println("tidak lulus")
    }else if(inputScore == 0){
        println("tidak ada nilai")
    }

//    print(isOdd(5))


//fun isOdd(number: Int): Boolean {
//    if (number % 2 == 0) {
//        return false
//    } else {
//        return true
//    }
//}

//    println(getDiscount(150.0, 10.0))


//    val score = 90
////    val grade = calculateGrade(score)
////    println("Nilai anda: $score")
////    println("Grade anda: $grade")
////
////
////
////    val hari: Int = 3
////    val hasilHari = when(hari) {
////        1 -> "Senin"
////        2 -> "Selasa"
////        3 -> "Rabu"
////        4 -> "Kamis"
////        5 -> "Jumat"
////        6 -> "Sabtu"
////        7 -> "Minggu"
////        else -> "tidak ada hari"
////    }
////    println(hasilHari)

//    val bilangan: Int = 5
//    val hasilBilangan = when{
//        bilangan > 0 -> println("Positif")
//        bilangan < 0 -> println("Negatif")
//        else -> print("nol")
//    }
//    println(hasilBilangan)
//    println("Number : $bilangan")

//    for (i in 0..20 step 2) {
//        print("$i")
//        if (i != 20) {
//            print(",")
//        }
//    }

//    val result = ('A'..'Z').joinToString(",")
//    println(result)


//    val bilanganGanjil = (1..100 step 2)
//    val jumlah = bilanganGanjil.sum()
//    println("jumlah bilangan ganjil dari 1 sampai 100 adalah $jumlah")

//    for (i in 1..5) {
//        for (j in 1..i) {
//            print("* ")
//        }
//        println()
//    }

//    val jumlahBintang = 4
//    for (i in 0 until jumlahBintang) {
//        for (j in 0 until jumlahBintang - i) {
//            print(" ")
//        }
//        for (j in 0..i) {
//            print("* ")
//        }
//        println()
//    }

//    val angka = (10 downTo 1).joinToString(",")
//    println(angka)

//    var i = 1
//    while (i <= 20) {
//        if (i % 2 == 0) {
//            println(i)
//        }
//        i++
//    }

//    var i = 1
//    var count = 0
//    while (i <= 50) {
//        if (i % 2 != 0) {
//            count++
//        }
//        i++
//    }
//    println("Jumlah bilangan ganjil antara 1 dan 50 adalah $count")
//    var i = 1
//    do {
//        if (i % 2 != 0) {
//            println(i)
//        }
//        i++
//    } while (i <= 20)

//    var f: Int
//    do {
//        print("Masukkan sebuah bilangan bulat positif: ")
//        f = readLine()?.toIntOrNull() ?: 0
//    } while (f <= 0)
//
//    var i = 1
//    while (i < f) {
//        println(i)
//        i++
//    }

//    var angka = 1
//
//    for (i in 1..50 step 2) {
//        if (i >= 25) {
//            break
//        }
//        angka++
//    }
//
//    println("Jumlah bilangan ganjil antara 1 dan 25 adalah $angka")

    val angkaArray = intArrayOf(5, 3, 7, 9, 6, 2)
    var hasilArray = 0

    for (i in angkaArray) {
        if (i % 3 == 0) {
            hasilArray = i
            break
        }
    }

    println("Bilangan pertama dalam array yang habis dibagi 3 adalah $hasilArray")

}

//fun calculateGrade(score: Int?): String {
//    val actualScore = score ?: 0
//    if (actualScore >= 90) {
//        return "A"
//    } else if (actualScore >= 80) {
//        return "B"
//    } else if (actualScore >= 70) {
//        return "C"
//    } else if (actualScore >= 60) {
//        return "D"
//    } else {
//        return "F"
//    }
//}




//fun calculateGrade(nilai: Int): String {
//    return when {
//        nilai >= 90 -> "A"
//        nilai >= 80 -> "B"
//        nilai >= 70 -> "C"
//        nilai >= 60 -> "D"
//        else -> "F"
//    }
//}


//fun getDiscount(price: Double, discount: Double): Double {
//    return if (price > 100 && discount > 10) {
//        price - (price * discount / 100)
//    } else {
//        price
//    }
//}


//    val evenNumbers = (0..20).filter { it % 2 == 0 }
//    println(evenNumbers)
//
//    val angka = 10 downTo 1
//    println(angka)



//    for (i in 1..7) {
//        for (j in 1..i) {
//            print("* ")
//        }
//        println()
//    }


//    var nilai = 1
//    while (nilai <= 5){
//        println("While loop $nilai")
//        nilai++
//    }

//    var i = 1
//    var count = 0
//

//    var hitung = 0
//    for(i in 1..50  ){
//        if (i % 2 == 1){
//            if (i >= 25){
//                break
//            }
//            hitung++
//        }
//    }
//    println("jumlah bilangan Sganjil antara 1 dan 50 adalah hitung $hitung")


//}                             // scope YANG ASLI FUN MAIN











