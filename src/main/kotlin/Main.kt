

fun main() {

//    val nama: String = "Farid"
//    println(nama)
//
//    val nama2: String = "Rifan"
//    println(nama2)
//
//    var firstName : String = "Farid"
//    var lastName : String = "Rifan"
//
//    println("nama mahasiswa : " + firstName + lastName )
//
//    print("nama mahasiswa : $firstName $lastName" )

//    var alamat : String =  """ Sleman;
//        |DI jogjakarta""".trimMargin()
//    println(alamat)

//    val namaStudent = Array( 3) {""}
//    namaStudent[0] =  "Jihan"
//    namaStudent[1] =  "Axel"
//    namaStudent[2] =  "Dheva"
//
//    println(namaStudent.contentToString())
//
//    println("Nama Student : ${namaStudent[1]}")
//
//    val umurStudent = arrayOf(21, 20, 13)
//    val statusStudent = booleanArrayOf(true, false, true, false, false)
//    val umurStudent2 = intArrayOf(21,20,23)
//
//    umurStudent2[1] = 19
//    println(umurStudent2[1])
//
//    val fruits = mutableListOf("apel", "jeruk", "durian")
//    fruits.add("salak")
//    fruits.remove("apel")
//    println(fruits)
//
//    val letter = listOf('A', 'B', 'C', 'D')
//    val randomIsi = listOf('A', 12, "anggur", false )
//    println(randomIsi)

        //soal no 1
        val nama : String = "John Doe"
        println("nama: $nama")
        println()

        //soal no 2
        val umur : Int = 25
        println("umur: $umur")
        println()

        //soal no 3
        val gaji: Double = 5000.0
        println("gaji: $gaji")
        println()

        //soal no 4
        val status: Boolean = true
        println("statrus: $status")
        println()

        //soal no 5
        val nilai : Float = 7.5f
        println("nilai: $nilai")
        println()

        //soal no 6
        val angka1: Long = 123456789L
        println("angka1: $angka1")
        println()

        //soal no 7
        val angka2: Short = 100
        println("angka2: $angka2")
        println()

        //soal no 8
        val huruf: Char = 'A'
        println("huruf: $huruf")
        println()

        //soal no 9
        val nilaiString : String = "10"
        println("nilai String: $nilaiString")
        println()

        //soal no 10
        val angka3: Byte = 25
        println("angka3: $angka3")
        println()

        //soal no 11
        val nilaiAngka : Array<Int> = arrayOf(1,2,3,4,5)
        println("angka Array: "+ nilaiAngka.contentToString())
        println()

        //soal no 12
        val hurufArray: Array<Char> = arrayOf('a', 'b', 'c', 'd', 'e')
        println("huruf Array: " + hurufArray.contentToString())
        println()

        //soal no 13
        val nilaiArray: Array<Double> = arrayOf(3.5, 4.0, 2.5, 3.0)
        println("nila iArray: " + nilaiArray.contentToString())
        println()

        //soal no 14
        val namaArray: Array<String> = arrayOf("John", "Doe", "Jane", "Doe")
        println("nama Array: " + namaArray.contentToString())
        println()

        //soal no 15
        val bulanArray =  Array<String>(12){""}
        bulanArray[0] = "Januari"
        bulanArray[1] = "Februari"
        bulanArray[2] = "Maret"
        bulanArray[3] = "April"
        bulanArray[4] = "Mei"
        bulanArray[5] = "Juni"
        bulanArray[6] = "Juli"
        bulanArray[7] = "Agustus"
        bulanArray[8] = "September"
        bulanArray[9] = "Oktober"
        bulanArray[10] = "November"
        bulanArray[11] = "Desember"

        val bulanString = bulanArray.joinToString(", ") // untuk menambahkan sring ", " pada array
        println("nama-nama bulan: $bulanString")
        println()

//        println(("${bulanArray.contentToString()}"))
//        println("[${bulanArray[0]}], [${bulanArray[1]}], [${bulanArray[2]}], [${bulanArray[3]}], [${bulanArray[4]}], [${bulanArray[5]}], [${bulanArray[6]}], [${bulanArray[7]}], [${bulanArray[8]}], [${bulanArray[9]}], [${bulanArray[10]}], [${bulanArray[11]}]")


        //soal no 16
        val nilaiArrayFloat: Array<Float> = arrayOf(2.5f, 3.0f, 2.0f)
        println("nilai Array Float:  $nilaiArrayFloat")
        println()

        //soal no 17
        val listAngka: List<Int> = listOf(1, 2, 3, 4, 5)
        println("list angka: $listAngka")
        println()

        //soal no 18
        val listHuruf: List<Char> = listOf('a', 'b', 'c', 'd', 'e')
        println("list huruf: $listHuruf")
        println()

        //soal no 19
        val listNilai: List<Double> = listOf(3.5, 4.0, 2.5, 3.0)
        println("list Nilai: $listNilai")
        println()

        //soal no 20
        val listNama: List<String> = listOf("John", "Doe", "Jane", "Doe")
        println("list Nama: $listNama")
        println()

        //soal no 21
        val listBulan: List<String> = listOf("Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember")
        println("list Bulan: $listBulan")
        println()

        //soal no 22
        val listNilaiFloat: List<Float> = listOf(2.5f, 3.0f, 2.0f)
        println("list Nilai Float: $listNilaiFloat")
        println()

        //soal no 23
        val listAngka1: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
        listAngka1[2] = 300
        println("Nilai List Angka yang diubah: $listAngka1")
        println()

        //soal no 24
        val listHuruf1: MutableList<Char> = mutableListOf('a', 'b', 'c', 'd', 'e')
        listHuruf1[4] = 'f'
        println("nilai List Huruf yang diubah: $listHuruf1")
        println()


        //soal no 25
        val listData : MutableList<Double> = mutableListOf(3.5, 4.0, 2.5, 3.0)
        listData.add(4, 3.5)
        listData.add(5, 4.0)
        listData.add(6, 4.5)
        listData.add(7, 5.0)
        println("List Data yang di tambahkan: $listData")
        println()





        //soal no 26
        val listData1: MutableList<String> = mutableListOf("John", "Doe", "Jane", "Doe")
        listData1.removeAt(2)                   //nama urutan ke 3 lah yang dihapus dengan menggunakan removeAt
        println("nilai list Data yang dihapus:  $listData1")
        println()

        //soal no 27
        val bulanBaru = listBulan.toMutableList() // memanggil variable listBulan yang sebelum nya List( immutable list )
                                                  // untuk dijadikan method toMutableList
        bulanBaru.add(1,"Januari")
        println("nilai list Bulan yang diubah ke bulan baru $bulanBaru")
        println()




}