modul 8

modul 8.4.1 Mencetak Argumen

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Komentar yang memberikan informasi tentang lisensi dan template yang digunakan untuk kelas ini.
/**
 *
 * @author HP 840 G3
 */ //Komentar yang menyatakan penulis dari kelas ini.
public class arithmetic { //Deklarasi kelas "arithmetic" yang berisi method "main". Method "main" adalah titik awal eksekusi program.
    public static void main(String[] args){
    
        //Mengambil argumen pertama dan kedua yang diberikan pada saat menjalankan program dan mengubahnya menjadi tipe data "int" menggunakan "Integer.parseInt()". Argumen pertama disimpan dalam variabel "angka1" dan argumen kedua disimpan dalam variabel "angka2".
        int angka1 = Integer.parseInt(args[0]);
        int angka2 = Integer.parseInt(args[1]);
        
        //operasi
        // Deklarasi variabel-variabel yang akan digunakan untuk menyimpan hasil operasi aritmatika.
        int tambah = 0;
        tambah = angka1 + angka2; //Variabel "tambah" digunakan untuk menyimpan hasil penjumlahan antara "angka1" dan "angka2".
        
        int kurang =0;
        kurang = angka1 - angka2; //Variabel "kurang" digunakan untuk menyimpan hasil pengurangan antara "angka1" dan "angka2".
         
        int kali = 1;
        kali = angka1 * angka2; //Variabel "kali" digunakan untuk menyimpan hasil perkalian antara "angka1" dan "angka2".
        
        int bagi = 1;
        bagi = angka1 / angka2; // Variabel "bagi" digunakan untuk menyimpan hasil pembagian antara "angka1" dan "angka2".  
        
        //hasil
        //Mencetak hasil operasi aritmatika.
        System.out.println("sum : "+tambah); //Mencetak hasil penjumlahan dengan menggunakan variabel "tambah".
        System.out.println("diff : "+kurang); //Mencetak hasil pengurangan dengan menggunakan variabel "kurang".
        System.out.println("product : "+kali); //Mencetak hasil perkalian dengan menggunakan variabel "kali".
        System.out.println("quotient : "+bagi); // Mencetak hasil pembagian dengan menggunakan variabel "bagi".
    }
}

modul 8.4.2 Operasi Aritmatika

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Komentar yang memberikan informasi tentang lisensi dan template yang digunakan untuk kelas ini.
/**
 *
 * @author HP 840 G3
 */ //Komentar yang menyatakan penulis dari kelas ini.
public class commandLine1 { //Deklarasi kelas "commandLine1" yang berisi method "main". Method "main" adalah titik awal eksekusi program. 
    public static void main(String[] args){
        for(int i=0;i<4;i++){ //Perulangan "for" yang digunakan untuk mencetak argumen yang diberikan saat menjalankan program melalui baris perintah (command line).
            System.out.println(" "+args[i]); //Mencetak argumen pada indeks "i" dengan menggunakan "System.out.println()". Argumen ini diperoleh dari array "args".
        } 
        System.out.println("number of argument : "+args.length); //Mencetak jumlah argumen yang diberikan saat menjalankan program melalui baris perintah (command line) dengan menggunakan "System.out.println()" dan "args.length". "args.length" mengembalikan panjang (jumlah elemen) dari array "args".
    }
}
