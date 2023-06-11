modul 6

6.5.1 Nilai 1
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmodul6; //Baris ini menentukan paket tempat kelas berada. Dalam contoh ini, kelas nilai16 berada dalam paket latihanmodul6.

/**
 *
 * @author HP 840 G3
 */
 
import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.io.IOException;
//Baris ini mengimpor kelas-kelas yang diperlukan dari pustaka java.io untuk membaca input pengguna dan mengatasi pengecualian I/O.

public class nilai16 { //Deklarasi kelas nilai16 yang merupakan nama kelas utama dalam program.
 public static void main(String[]args){ //Metode main merupakan metode utama yang akan dieksekusi saat program dijalankan.
  BufferedReader nilai = new BufferedReader(new InputStreamReader(System.in)); //Objek BufferedReader digunakan untuk membaca input dari pengguna. Ini mengambil input dari System.in dan membungkusnya dalam InputStreamReader.
  
  //Deklarasi tiga variabel bertipe String yang akan digunakan untuk menyimpan input pengguna.
  String r="";
  String s="";
  String t="";
  
  try{
   System.out.print("Masukkan nilai pertama Anda: ");
   r = nilai.readLine();
   System.out.print("Masukkan nilai kedua Anda: ");
   s = nilai.readLine();
   System.out.print("Masukkan nilai ketiga Anda: ");
   t = nilai.readLine();
  }catch(IOException e){
   System.out.println("Kata yang Anda masukkan salah, silahkan coba lagi.");
  }
  
  //Pada blok try, program mencoba membaca input pengguna menggunakan nilai.readLine(). Jika terjadi pengecualian IOException, blok catch akan menangkapnya dan mencetak pesan kesalahan.
  
  //Mengonversi tiga variabel r, s, dan t yang berisi input pengguna dalam bentuk String menjadi tipe data int.
  int pertama;
  int kedua;
  int ketiga;
  
  pertama = Integer.parseInt(r);
  kedua = Integer.parseInt(s);
  ketiga = Integer.parseInt(t);
  
  int rata_rata=(pertama+kedua+ketiga)/3; //Menghitung rata-rata dari tiga nilai yang dimasukkan pengguna dengan menjumlahkan nilai-nila tersebut dan membaginya dengan 3.
  
  System.out.println("Rata-rata nilai Anda: "+rata_rata); //Mencetak output ke konsol yang menampilkan rata-rata nilai yang dihitung.
  
  //Menggunakan pernyataan if untuk mengecek apakah rata-rata nilai kurang dari atau sama dengan 60. Jika benar, mencetak ":-(", jika tidak, mencetak ":-)".
   if (rata_rata<=60){System.out.println(":-(");
  }
  else {
   System.out.println(":-)");
  }
 }
}

6.5.1 Nilai 2
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmodul6; //Baris ini menentukan paket tempat kelas berada. Dalam contoh ini, kelas nilai26 berada dalam paket latihanmodul6. 

/**
 *
 * @author HP 840 G3
 */
import javax.swing.JOptionPane; //Baris ini mengimpor kelas JOptionPane dari pustaka Swing. Kelas ini digunakan untuk membuat dialog input dan dialog pesan.

public class nilai26 { //Deklarasi kelas nilai26 yang merupakan nama kelas utama dalam program.
    public static void main(String[]args){ //Metode main merupakan metode utama yang akan dieksekusi saat program dijalankan.
    
    //Deklarasi tiga variabel bertipe String yang akan digunakan untuk menyimpan input pengguna.
  String r="";
  String s="";
  String t="";
  
  
  r=JOptionPane.showInputDialog("Masukkan nilai pertama Anda"); //Muncul dialog input menggunakan JOptionPane.showInputDialog yang meminta pengguna memasukkan nilai pertama. Nilai yang dimasukkan akan disimpan di variabel r.
  int pertama = Integer.valueOf(r).intValue(); //Mengonversi nilai yang ada di variabel r yang berisi input pengguna dalam bentuk String menjadi tipe data int menggunakan Integer.valueOf().
  s=JOptionPane.showInputDialog("Masukkan nilai kedua Anda"); //Langkah yang sama seperti langkah sebelumnya dilakukan untuk mendapatkan dan mengonversi nilai kedua dan ketiga yang dimasukkan oleh pengguna.
  int kedua = Integer.valueOf(s).intValue();
  t=JOptionPane.showInputDialog("Masukkan nilai ketiga Anda");
  int ketiga = Integer.valueOf(t).intValue();
  
  int rata_rata=(pertama+kedua+ketiga)/3; //Menghitung rata-rata dari tiga nilai yang dimasukkan pengguna dengan menjumlahkan nilai-nila tersebut dan membaginya dengan 3.
  
  //Menggunakan variabel hasil bertipe String untuk menyimpan hasil output yang akan ditampilkan dalam dialog pesan. Nilai-nilai pertama, kedua, ketiga, dan rata-rata ditambahkan ke variabel hasil. 
  String hasil= "";
  hasil += "Nilai pertama: " +pertama +"\n";
  hasil += "Nilai kedua: " +kedua +"\n";
  hasil += "Nilai ketiga: " +ketiga +"\n";
  hasil += "Rata-rata nilai Anda adalah " +rata_rata+"\n";
   
   //Pernyataan if digunakan untuk mengecek apakah rata-rata nilai kurang dari atau sama dengan 60. Jika benar, ":-(\n" akan ditambahkan ke variabel hasil. Jika tidak, ":-)\n" akan ditambahkan.
   if (rata_rata<=60){
   hasil +=":-("+"\n";
  }
  else {hasil +=":-)"+"\n";
  }
  JOptionPane.showMessageDialog(null, hasil);  //Menampilkan dialog pesan menggunakan JOptionPane.showMessageDialog dengan isi pesan yang berada dalam variabel hasil. Pesan tersebut akan muncul dalam dialog pop-up.
  }
 }
 
 
 
 6.5.2 Membaca bilangan
 
 
 6.5.2.1 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmodul6; //Baris ini menentukan paket tempat kelas berada. Dalam contoh ini, kelas membacaBilanganIfElse6 berada dalam paket latihanmodul6.

/**
 *
 * @author HP 840 G3
 */
import javax.swing.JOptionPane; //Baris ini mengimpor kelas JOptionPane dari pustaka Swing. Kelas ini digunakan untuk membuat dialog input dan dialog pesan.
public class membacaBilanganIfElse6 { //Deklarasi kelas membacaBilanganIfElse6 yang merupakan nama kelas utama dalam program.
    public static void main(String[]args){ //Metode main merupakan metode utama yang akan dieksekusi saat program dijalankan.
  String angka=""; //Deklarasi variabel angka bertipe String yang akan digunakan untuk menyimpan input pengguna.
  angka=JOptionPane.showInputDialog("Silahkan masukkan angka "); //Muncul dialog input menggunakan JOptionPane.showInputDialog yang meminta pengguna memasukkan angka. Angka yang dimasukkan akan disimpan di variabel angka.
  int z = Integer.valueOf(angka).intValue(); //Mengonversi nilai yang ada di variabel angka yang berisi input pengguna dalam bentuk String menjadi tipe data int menggunakan Integer.valueOf(). 
  
  String hasil =""; //Deklarasi variabel hasil bertipe String yang akan digunakan untuk menyimpan hasil output.
  
  //Menggunakan pernyataan if-else untuk memeriksa apakah nilai z berada di antara 1 dan 10. Jika benar, "Valid number" akan ditambahkan ke variabel hasil. Jika tidak, "Invalid number" akan ditambahkan.
  if (z>=1&&z<=10){
   hasil += "Valid number";
  }
  else{
   hasil += "Invalid Number";
  }
 JOptionPane.showMessageDialog(null, hasil); //Menampilkan dialog pesan menggunakan JOptionPane.showMessageDialog dengan isi pesan yang berada dalam variabel hasil. Pesan tersebut akan muncul dalam dialog pop-up.
 }
}

6.5.2.2

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmodul6; //Baris ini menentukan paket tempat kelas berada. Dalam contoh ini, kelas membacaBilanganSwitch6 berada dalam paket latihanmodul6.

/**
 *
 * @author HP 840 G3
 */
import javax.swing.JOptionPane; //Baris ini mengimpor kelas JOptionPane dari pustaka Swing. Kelas ini digunakan untuk membuat dialog input dan dialog pesan.
public class membacaBilanganSwitch6 { //Deklarasi kelas membacaBilanganSwitch6 yang merupakan nama kelas utama dalam program.
     public static void main(String[]args){ //Metode main merupakan metode utama yang akan dieksekusi saat program dijalankan.
  String angka=""; //Deklarasi variabel angka bertipe String yang akan digunakan untuk menyimpan input pengguna. 
  angka=JOptionPane.showInputDialog("Silahkan masukkan angka "); //Muncul dialog input menggunakan JOptionPane.showInputDialog yang meminta pengguna memasukkan angka. Angka yang dimasukkan akan disimpan di variabel angka.
  int z = Integer.valueOf(angka).intValue(); //Mengonversi nilai yang ada di variabel angka yang berisi input pengguna dalam bentuk String menjadi tipe data int menggunakan Integer.valueOf().
 
  String hasil=""; //Deklarasi variabel hasil bertipe String yang akan digunakan untuk menyimpan hasil output.
  
  //Pernyataan switch digunakan untuk memeriksa nilai z dan mengevaluasi berbagai kasus. Jika nilai z cocok dengan salah satu kasus (1 hingga 10), maka hasil akan ditambahkan dengan "Valid Number". Jika tidak cocok dengan kasus apa pun, maka hasil akan ditambahkan dengan "Invalid Number". Pernyataan break digunakan untuk keluar dari pernyataan switch setelah sebuah kasus terpenuhi.
  switch(z){
  case 1: hasil+= "Valid Number"; break;
  case 2: hasil+= "Valid Number"; break;
  case 3: hasil+= "Valid Number"; break;
  case 4: hasil+= "Valid Number"; break;
  case 5: hasil+= "Valid Number"; break;
  case 6: hasil+= "Valid Number"; break;
  case 7: hasil+= "Valid Number"; break;
  case 8: hasil+= "Valid Number"; break;
  case 9: hasil+= "Valid Number"; break;
  case 10: hasil+= "Valid Number"; break;
  default: hasil+= "Invalid Number"; break;
  }
 JOptionPane.showMessageDialog(null, hasil); //Menampilkan dialog pesan menggunakan JOptionPane.showMessageDialog dengan isi pesan yang berada dalam variabel hasil. Pesan tersebut akan muncul dalam dialog pop-up.
 }
}


modul 6.5.3 Cetak Seratus Kali

modul 6.5.3 while loop
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmodul6; //Baris ini menentukan paket tempat kelas berada. Dalam contoh ini, kelas cetakWhileLoop6 berada dalam paket latihanmodul6.

/**
 *
 * @author HP 840 G3
 */
public class cetakWhileLoop6 { //Deklarasi kelas cetakWhileLoop6 yang merupakan nama kelas utama dalam program. 
    public static void main(String args[]){ //Metode main merupakan metode utama yang akan dieksekusi saat program dijalankan.
  int r=0; //Deklarasi variabel r bertipe int dan diinisialisasi dengan nilai 0. Variabel r akan digunakan sebagai penghitung untuk mengontrol perulangan.
  
  //Perulangan while digunakan untuk mencetak pesan "HAFIZHOH VIARMA" sebanyak 100 kali. Selama nilai variabel r kurang dari 100, blok pernyataan di dalam while akan dijalankan. Pada setiap iterasi perulangan, pesan akan dicetak menggunakan System.out.println("HAFIZHOH VIARMA"), dan nilai r akan ditingkatkan dengan r++ untuk menghindari perulangan yang tak terbatas. Setelah r mencapai atau melebihi 100, perulangan berhenti. Program ini akan mencetak pesan "HAFIZHOH VIARMA" sebanyak 100 kali secara berurutan dalam baris terpisah.
  while (r<100){
   System.out.println("HAFIZHOH VIARMA");
   r++;
  }
 }
} 

modul 6.5.3 do while
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmodul6; //Baris ini menentukan paket tempat kelas berada. Dalam contoh ini, kelas cetakDoWhile6 berada dalam paket latihanmodul6.

/**
 *
 * @author HP 840 G3
 */
public class cetakDoWhile6 { //Deklarasi kelas cetakDoWhile6 yang merupakan nama kelas utama dalam program.
    public static void main(String args[]){ //Metode main merupakan metode utama yang akan dieksekusi saat program dijalankan.
 int r = 0; //Deklarasi variabel r bertipe int dan diinisialisasi dengan nilai 0. Variabel r akan digunakan sebagai penghitung untuk mengontrol perulangan.
 
 //Perulangan do-while digunakan untuk mencetak pesan "HAFIZHOH VIARMA" sebanyak 100 kali. Blok pernyataan di dalam do akan dieksekusi terlebih dahulu, kemudian kondisi while akan dievaluasi. Selama kondisi r<100 terpenuhi, perulangan akan berlanjut. Pada setiap iterasi perulangan, pesan akan dicetak menggunakan System.out.println("HAFIZHOH VIARMA"), dan nilai r akan ditingkatkan dengan r++ untuk menghindari perulangan yang tak terbatas. Setelah r mencapai atau melebihi 100, perulangan berhenti.

Program ini akan mencetak pesan "HAFIZHOH VIARMA" sebanyak 100 kali secara berurutan dalam baris terpisah. Perbedaan utama antara do-while dan while adalah bahwa do-while akan menjalankan blok pernyataan setidaknya satu kali, bahkan jika kondisi awalnya tidak terpenuhi.

 do {
  System.out.println("HAFIZHOH VIARMA");
  r++;
  } while (r<100);
 }
}

modul 6.5.3 for loop

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmodul6; //Baris ini menentukan paket tempat kelas berada. Dalam contoh ini, kelas cetakForLoop6 berada dalam paket latihanmodul6.

/**
 *
 * @author HP 840 G3
 */
public class cetakForLoop6 { //Deklarasi kelas cetakForLoop6 yang merupakan nama kelas utama dalam program.
    public static void main(String args[]){ //Metode main merupakan metode utama yang akan dieksekusi saat program dijalankan.
 int r; //Deklarasi variabel r bertipe int. Variabel r akan digunakan sebagai penghitung untuk mengontrol perulangan.
 
 //Perulangan for digunakan untuk mencetak pesan "HAFIZHOH VIARMA" sebanyak 100 kali. Pada awal perulangan, r diinisialisasi dengan nilai 0. Selama kondisi r<100 terpenuhi, perulangan akan terus berlanjut. Pada setiap iterasi perulangan, pesan akan dicetak menggunakan System.out.println("HAFIZHOH VIARMA"), dan nilai r akan ditingkatkan dengan r++. Setelah r mencapai atau melebihi 100, perulangan berhenti.

Program ini akan mencetak pesan "HAFIZHOH VIARMA" sebanyak 100 kali secara berurutan dalam baris terpisah. Perulangan for memungkinkan untuk mengatur penghitung, kondisi perulangan, dan langkah iterasi dalam satu baris pernyataan.
 for (r=0; r<100; r++){
 System.out.println("HAFIZHOH VIARMA"); 
 }
 }
}


modul 6.5.4 Perpangkatan 

6.5.4 while loop
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmodul6; //Baris ini menentukan paket tempat kelas berada. Dalam contoh ini, kelas pangkatWhileLoop6 berada dalam paket latihanmodul6.

/**
 *
 * @author HP 840 G3
 */
import java.io.*; //Baris ini mengimpor paket java.io yang berisi kelas-kelas yang digunakan untuk operasi input-output.

public class pangkatWhileLoop6 { //Deklarasi kelas pangkatWhileLoop6 yang merupakan nama kelas utama dalam program.
    public static void main (String [] args) //Metode main merupakan metode utama yang akan dieksekusi saat program dijalankan.
    {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in)); //Baris ini membuat objek BufferedReader untuk membaca input dari pengguna. Objek tersebut menggunakan System.in sebagai sumber input.
        int nilai,pangkat,hasil,i; //Deklarasi variabel nilai, pangkat, hasil, dan i bertipe int. Variabel-variabel ini akan digunakan dalam proses perhitungan pangkat.
        
        //Kode dalam blok try digunakan untuk menangani input-output dan pemrosesan angka. Jika terjadi IOException (kesalahan input-output), blok catch akan menangkapnya dan mencetak pesan "error".
        try{
        //Baris ini meminta pengguna untuk memasukkan angka dan pangkat yang akan dihitung. Input dari pengguna kemudian dibaca menggunakan readLine() dan diubah menjadi tipe data int menggunakan Integer.parseInt().
            System.out.print("masukan angka : ");
            nilai = Integer.parseInt(dataIn.readLine());
            System.out.print("masukan pangkat : ");
            pangkat = Integer.parseInt(dataIn.readLine());
            
          hasil =1;
          i=1;
          
          //Perulangan while digunakan untuk menghitung pangkat angka. Pada setiap iterasi perulangan, variabel hasil akan dikalikan dengan nilai, kemudian nilai hasil akan dicetak. Penghitungan dilakukan sebanyak pangkat kali dengan menggunakan variabel i sebagai penghitung. Setelah i mencapai atau melebihi pangkat, perulangan berhenti.
Program ini akan meminta pengguna untuk memasukkan angka dan pangkat. Setelah itu, program akan menghitung dan mencetak hasil pangkat angka sebanyak pangkat kali.
          while (i <= pangkat){
            hasil = hasil * nilai;
            System.out.println("hasil = "+hasil);
            i++;
          }
        
        }catch(IOException e){
            System.out.println("error");
        }
    
    }
}

6.5.4 do while

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmodul6; //Baris ini menentukan paket tempat kelas berada. Dalam contoh ini, kelas pangkatDoWhile6 berada dalam paket latihanmodul6.

/**
 *
 * @author HP 840 G3
 */
import java.io.*; //Baris ini mengimpor paket java.io yang berisi kelas-kelas yang digunakan untuk operasi input-output.
public class pangkatDoWhile6 { //Deklarasi kelas pangkatDoWhile6 yang merupakan nama kelas utama dalam program.
    public static void main (String [] args) //Metode main merupakan metode utama yang akan dieksekusi saat program dijalankan. 
    {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in)); //Baris ini membuat objek BufferedReader untuk membaca input dari pengguna. Objek tersebut menggunakan System.in sebagai sumber input.
        int nilai,pangkat,hasil,i; //Deklarasi variabel nilai, pangkat, hasil, dan i bertipe int. Variabel-variabel ini akan digunakan dalam proses perhitungan pangkat.
        
        try{ //Kode dalam blok try digunakan untuk menangani input-output dan pemrosesan angka. Jika terjadi IOException (kesalahan input-output), blok catch akan menangkapnya dan mencetak pesan "error".
        ///Baris ini meminta pengguna untuk memasukkan angka dan pangkat yang akan dihitung. Input dari pengguna kemudian dibaca menggunakan readLine() dan diubah menjadi tipe data int menggunakan Integer.parseInt().
            System.out.print("masukan angka : ");
            nilai = Integer.parseInt(dataIn.readLine());
            System.out.print("masukan pangkat : ");
            pangkat = Integer.parseInt(dataIn.readLine());
            
          //Perulangan do-while digunakan untuk menghitung pangkat angka. Pada setiap iterasi perulangan, variabel hasil akan dikalikan dengan nilai, kemudian nilai hasil akan dicetak. Penghitungan dilakukan sebanyak pangkat kali dengan menggunakan variabel i sebagai penghitung. Perulangan dilanjutkan selama i kurang dari atau sama dengan pangkat.  
          hasil =1;
          i=1;
          do
          {
              hasil = hasil * nilai;
              System.out.println("hasil =" + hasil);
              i++;
          }while (i<=pangkat);
          
        
        }catch(IOException e){ 
            System.out.println("error");
        }
        //Jika terjadi kesalahan saat membaca input, pesan "error" akan dicetak.

Kode tersebut menghasilkan hasil perhitungan pangkat dari angka yang dimasukkan oleh pengguna.
    }
}


6.5.4 for loop

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmodul6; //Baris ini menentukan paket tempat kelas berada. Dalam contoh ini, kelas pangkatForLoop6 berada dalam paket latihanmodul6.

/**
 *
 * @author HP 840 G3
 */
import java.io.*; //Baris ini mengimpor paket java.io yang berisi kelas-kelas yang digunakan untuk operasi input-output.
public class pangkatForLoop6 { //Deklarasi kelas pangkatForLoop6 yang merupakan nama kelas utama dalam program.
     public static void main (String [] args) //Metode main merupakan metode utama yang akan dieksekusi saat program dijalankan.
    {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in)); //Baris ini membuat objek BufferedReader untuk membaca input dari pengguna. Objek tersebut menggunakan System.in sebagai sumber input.
        int nilai,pangkat,hasil,i;  //Deklarasi variabel nilai, pangkat, hasil, dan i bertipe int. Variabel-variabel ini akan digunakan dalam proses perhitungan pangkat.
        
        try{ //Kode dalam blok try digunakan untuk menangani input-output dan pemrosesan angka. Jika terjadi IOException (kesalahan input-output), blok catch akan menangkapnya dan mencetak pesan "error".
            System.out.print("masukan angka : ");
            nilai = Integer.parseInt(dataIn.readLine());
            System.out.print("masukan pangkat : ");
            pangkat = Integer.parseInt(dataIn.readLine()); //Baris ini meminta pengguna untuk memasukkan angka dan pangkat yang akan dihitung. Input dari pengguna kemudian dibaca menggunakan readLine() dan diubah menjadi tipe data int menggunakan Integer.parseInt().
            
          //Perulangan for digunakan untuk menghitung pangkat angka. Variabel i dimulai dari 1 dan terus bertambah hingga mencapai pangkat. Pada setiap iterasi perulangan, variabel hasil akan dikalikan dengan nilai, kemudian nilai hasil akan dicetak.  
          hasil=1;
          for (i=1; i<=pangkat; i++){
              hasil= hasil * nilai;
              System.out.println("hasil = "+ hasil);
          }
        
        }catch(IOException e){
            System.out.println("error");
        }
    //Jika terjadi kesalahan saat membaca input, pesan "error" akan dicetak.

Kode tersebut menghasilkan hasil perhitungan pangkat dari angka yang dimasukkan oleh pengguna menggunakan perulangan for.
    }
}
