modul 5.1

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmodul5; //Ini adalah pernyataan package yang menentukan namespace atau ruang nama untuk kelas-kelas dalam file ini.

/**
 *
 * @author HP 840 G3
 */
 //Ini adalah pernyataan import yang mengimpor kelas-kelas yang diperlukan dari paket java.io. Kode ini mengimpor kelas BufferedReader, InputStreamReader, dan IOException.
import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.io.IOException;
    
public class latihanmodul51{ //Ini adalah deklarasi kelas dengan nama latihanmodul51. Kelas ini adalah kelas utama yang akan berisi metode main.


      public static void main (String[] args){ //Ini adalah metode main, yang akan dijalankan ketika program dimulai. Metode ini menerima argumen dari baris perintah dalam bentuk array args. 
            BufferedReader dataIN = new BufferedReader (new InputStreamReader (System.in)); //Ini adalah deklarasi objek dataIN yang bertipe BufferedReader. Objek ini digunakan untuk membaca input dari pengguna melalui keyboard. 
            //Ini adalah deklarasi variabel bertipe String dengan nama name1, name2, dan name3. Variabel ini digunakan untuk menyimpan input dari pengguna.
            String name1 = "";
            String name2 = "";
            String name3 = "";
            
            //Ini adalah blok try-catch yang menangani pengecualian yang mungkin terjadi saat membaca input dari pengguna. Baris-baris di dalam blok try akan mencetak pesan ke layar dan membaca input dari pengguna menggunakan metode readLine() dari objek dataIN. Jika ada pengecualian yang terjadi, ia akan ditangkap oleh blok catch dan tidak ada tindakan khusus yang dilakukan.
            try{
                System.out.println("Enter Word1=");
                name1=dataIN.readLine();
                System.out.println("Enter Word2=");
                name2=dataIN.readLine();
                System.out.println("Enter Word3");
                name3=dataIN.readLine();
                }catch(IOException e){
                }
            System.out.println(name1 + " " + name2 + " " + name3 + " "); //Ini adalah pernyataan cetak yang mencetak nilai dari name1, name2, dan name3, dipisahkan oleh spasi, ke layar.
      }
}


modul 5.2

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 840 G3
 */
import javax.swing.*; //Baris ini mengimpor kelas-kelas yang diperlukan dari pustaka Swing untuk membuat GUI. 
public class latihanmodul52 { //Deklarasi kelas latihanmodul52 yang merupakan nama kelas utama dalam program. 
    public static void main(String[] args) { //Metode main merupakan metode utama yang akan dieksekusi saat program dijalankan.
        String name1; //Deklarasi tiga variabel bertipe String yang akan digunakan untuk menyimpan input pengguna.
        String name2; //Deklarasi tiga variabel bertipe String yang akan digunakan untuk menyimpan input pengguna. 
        String name3; //Deklarasi tiga variabel bertipe String yang akan digunakan untuk menyimpan input pengguna.  
        
        //Tiga dialog input menggunakan JOptionPane.showInputDialog akan muncul di layar untuk meminta pengguna memasukkan kata-kata. Input yang dimasukkan    akan disimpan di variabel name1, name2, dan name3 secara berurutan.
        name1 = JOptionPane.showInputDialog("Enter Word1");
        name2 = JOptionPane.showInputDialog("Enter Word2");
        name3 = JOptionPane.showInputDialog("Enter Word3");
        
        //Mencetak output ke konsol dengan menggunakan System.out.println yang menampilkan nilai dari variabel name1, name2, dan name3.
        System.out.println("Word1 = "+name1);
        System.out.println("Word2 = "+name2);
        System.out.println("Word3 = "+name3);
        
        String msg = name1 + name2 + name3; //Menggabungkan nilai dari variabel name1, name2, dan name3 menjadi satu string dan menyimpannya dalam variabel msg. 
        JOptionPane.showMessageDialog(null, msg); //Muncul dialog pesan dengan menggunakan JOptionPane.showMessageDialog, menampilkan isi dari variabel msg yang berisi gabungan kata-kata yang dimasukkan oleh pengguna.
    }
    
} //Penutup dari kelas latihanmodul52.
