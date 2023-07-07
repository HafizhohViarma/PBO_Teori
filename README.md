ReadMe Modul 12

Exception
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */ 
 //Bagian ini adalah komentar yang memberikan informasi tentang lisensi dan template file. Komentar ini tidak berpengaruh pada jalannya program.
 
package modul12; //Baris ini menunjukkan bahwa kelas ini berada di dalam package "Modul12". Package digunakan untuk mengorganisir kelas-kelas dalam struktur hierarki yang teratur.

/**
 *
 * @author HPG4
 */
public class Exception { //Ini adalah deklarasi kelas utama dengan nama "Exception". Nama kelas ini sama dengan nama file .java yang digunakan. Kelas ini akan berisi metode main yang merupakan titik masuk eksekusi program.

    public static void main(String[] args) {//Metode main adalah metode utama yang dieksekusi saat program dimulai. Metode ini memiliki parameter String[] args yang merupakan array argumen baris perintah yang dapat diteruskan ke program saat dijalankan.

//Kode dibawah ini merupakan blok try-catch-finally. Blok try digunakan untuk mengeksekusi potongan kode yang mungkin menimbulkan eksepsi (exception). Jika terjadi eksepsi, blok catch akan menangkapnya dan menjalankan kode di dalamnya. Blok finally akan dijalankan baik terjadi eksepsi maupun tidak
Dalam kode ini, perulangan for digunakan untuk mencetak elemen-elemen array args. Namun, jika args melebihi panjang array yang ada, maka akan terjadi ArrayIndexOutOfBoundsException. Eksepsi ini ditangkap oleh blok catch yang akan mencetak pesan "Exception caught:" diikuti dengan informasi eksepsi itu sendiri
Setelah itu, blok finally akan mencetak pesan "Quitting...".
Jadi, kode ini mencoba mencetak elemen-elemen array args dan menangani eksepsi ArrayIndexOutOfBoundsException jika terjadi, serta mencetak pesan "Quitting..." pada akhirnya.

        try {
            for (int i = 0; true; i++) {
                System.out.println("args[" + i + "]=" + args[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught:");
            System.out.println(e);
        } finally {
            System.out.println("Quitting...");
        }
    }
}

modul12

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */ // //Bagian ini adalah komentar yang memberikan informasi tentang lisensi dan template file. Komentar ini tidak berpengaruh pada jalannya program.
package Modul12; //Baris ini menunjukkan bahwa kelas ini berada di dalam package "Modul12". Package digunakan untuk mengorganisir kelas-kelas dalam struktur hierarki yang teratur. 

/**
 *
 * @author HP 840 G3
 */
public class Modul12Latihan { //Ini adalah deklarasi kelas utama dengan nama "Modul12Latihan". Nama kelas ini sama dengan nama file .java yang digunakan. Kelas ini akan berisi metode main yang merupakan titik masuk eksekusi program.

    public static void main(String[] args) { //Metode main adalah metode utama yang dieksekusi saat program dimulai. Metode ini memiliki parameter String[] args yang merupakan array argumen baris perintah yang dapat diteruskan ke program saat dijalankan.
   
        System.out.println("Hello World!"); //Ini adalah pernyataan cetak yang menggunakan metode println dari kelas System. Pernyataan ini mencetak pesan "Hello World!" ke konsol saat program dieksekusi.

Jadi, kode ini hanya mencetak pesan "Hello World!" ke konsol saat program dijalankan.
    }
}

TestException

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
   */
   //komentar yang memberikan informasi tentang lisensi dan template file. Komentar ini tidak mempengaruhi jalannya program.

package Modul12; //Baris ini menunjukkan bahwa kelas ini berada di dalam package "Modul12". Package digunakan untuk mengorganisir kelas-kelas dalam struktur hierarki yang teratur.

/**
 *
 * @author HP 840 G3
 */
public class TestException { //Ini adalah deklarasi kelas utama dengan nama "TestException". Nama kelas ini sama dengan nama file .java yang digunakan. Kelas ini akan berisi metode main yang merupakan titik masuk eksekusi program.

    public static void main(String[] args) { //Metode main adalah metode utama yang dieksekusi saat program dimulai. Metode ini memiliki parameter String[] args yang merupakan array argumen baris perintah yang dapat diteruskan ke program saat dijalankan.
   
//Kode dibawah ini juga menggunakan blok try-catch untuk menangani eksepsi yang mungkin terjadi. Dalam blok try, terdapat perulangan for yang mencoba mencetak elemen-elemen array args. Namun, jika args melebihi panjang array yang ada, maka akan terjadi ArrayIndexOutOfBoundsException. Eksepsi ini ditangkap oleh blok catch yang menggunakan variabel i sebagai penanganan eksepsi. Pada blok catch, pesan "Exception caught:" akan dicetak, diikuti dengan informasi eksepsi i. Kemudian, pesan "Quitting..." akan dicetak.
Jadi, kode ini mencoba mencetak elemen-elemen array args dan menangani eksepsi ArrayIndexOutOfBoundsException jika terjadi. Jika eksepsi terjadi, pesan yang sesuai akan dicetak.
        try {
            for (int i = 0; true; i++) {
                System.out.println("args[" + i + "]=" + args[i]);
            }
        } catch (ArrayIndexOutOfBoundsException i) {
            System.out.println("Exception caught:");
            System.out.println(i);
            System.out.println("Quitting...");
        }
    }
}


