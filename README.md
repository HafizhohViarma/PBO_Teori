modul 7 

modul 7.7.1 Hari dalam Seminggu 
modul 7.7.1 while loop

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 840 G3
 */   //Komentar yang memberikan informasi tentang lisensi dan template yang digunakan untuk kelas ini. 
public class latihan1WhileLoop {  //Deklarasi kelas "latihan1WhileLoop" yang berisi method "main". Method "main" adalah titik awal eksekusi program. 
    public static void main (String[] args){
        String[] hari = { //Deklarasi dan inisialisasi array "hari" yang berisi nama-nama hari dalam bahasa Indonesia.
            "senin","selasa","rabu","kamis","jumat","sabtu","minggu"
        };
        
        int i=0; //Deklarasi variabel "i" dengan nilai awal 0.
        while(i<hari.length) //Perulangan while yang akan terus berjalan selama nilai "i" kurang dari panjang array "hari".
        {
            System.out.println(hari[i]); //Mencetak elemen array "hari" pada indeks "i".
            i++; //Meningkatkan nilai "i" sebesar 1.
        }
    }
}

modul 7.7.1 do while

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 840 G3
 */  //Komentar yang memberikan informasi tentang lisensi dan template yang digunakan untuk kelas ini. 
public class latihan1doWhile { //Komentar yang menyatakan penulis dari kelas ini.
    public static void main(String[] args){ //Deklarasi kelas "latihan1doWhile" yang berisi method "main". Method "main" adalah titik awal eksekusi program.
        String hari[] = { //Deklarasi dan inisialisasi array "hari" yang berisi nama-nama hari dalam bahasa Indonesia.
            "senin","selasa","rabu","kamis","jumat","sabtu","minggu"
        }; 
        int i=0; //Deklarasi variabel "i" dengan nilai awal 0.
        do //Perulangan do-while yang akan melakukan hal berikut:
            {
                System.out.println(hari[i]);  //Mencetak elemen array "hari" pada indeks "i".
                i++; //Meningkatkan nilai "i" sebesar 1.
            }while(i<hari.length); //Kondisi perulangan do-while. Perulangan akan terus berjalan selama nilai "i" kurang dari panjang array "hari".
    }
}

modul 7.7.1 for

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 840 G3
 */ //Komentar yang memberikan informasi tentang lisensi dan template yang digunakan untuk kelas ini.
public class latihan1For { //Komentar yang menyatakan penulis dari kelas ini.
    public static void main(String[]args) //Deklarasi kelas "latihan1For" yang berisi method "main". Method "main" adalah titik awal eksekusi program. 
    {
        String[] hari = { "Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"}; // Deklarasi dan inisialisasi array "hari" yang berisi nama-nama hari dalam bahasa Indonesia.
        for(int i=0;i<hari.length;i++) //Perulangan for yang memiliki tiga bagian: inisialisasi (int i=0), kondisi perulangan (i<hari.length), dan ekspresi iterasi (i++).
            {
                System.out.println(hari[i]); // Mencetak elemen array "hari" pada indeks "i".
                ;
            } //Tutup kurung kurawal untuk menandai akhir blok perulangan.
    }
} //Hasil output program ini adalah mencetak nama-nama hari dalam bahasa Indonesia.

modul 7.7.2 Nomor Terbesar

 **Buffered Reader**
 
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Komentar yang memberikan informasi tentang lisensi dan template yang digunakan untuk kelas ini.
/**
 *
 * @author HP  840 G3 //Komentar yang menyatakan penulis dari kelas ini.
 */  
import java.io.BufferedReader; //Mengimpor kelas BufferedReader dari paket java.io yang digunakan untuk membaca input dari pengguna.
import java.io.InputStreamReader; //Mengimpor kelas InputStreamReader dari paket java.io yang digunakan untuk mengonversi input stream ke karakter.
public class latihan2BufferedReader {
    public static void main(String[] args){ //Deklarasi kelas latihan2BufferedReader yang berisi method main. Method main adalah titik awal eksekusi program. 
        BufferedReader masukan=new BufferedReader(new InputStreamReader(System.in)); //Membuat objek BufferedReader dengan menginisialisasinya menggunakan objek InputStreamReader yang mengambil input dari System.in.
         int data[]=new int[10]; //Membuat array data dengan panjang 10 untuk menyimpan data yang dimasukkan oleh pengguna.
        String input=""; //Mendeklarasikan variabel input dengan tipe data String dan menginisialisasinya dengan string kosong.
            for (int i=0;i<data.length;i++){ //Perulangan for untuk meminta pengguna memasukkan data sebanyak 10 kali.
                System.out.print("masukan data ke "+(i+1)+":"); //Mencetak pesan permintaan input kepada pengguna.
            try{
                input=masukan.readLine(); 
                //Menggunakan BufferedReader untuk membaca input dari pengguna dan mengubahnya menjadi tipe data int. 
                //Nilai yang dimasukkan kemudian disimpan di dalam array data pada indeks yang sesuai.
                data[i]=Integer.parseInt(input);
            }catch (Exception e){              
                } ////Menangani eksepsi yang terjadi jika terjadi kesalahan saat membaca input dari pengguna.
            }
            int terbesar =data[0];
            for (int i=0;i<data.length;i++){ //Perulangan for untuk mencari nilai terbesar dalam array data.
                if(data[i]>terbesar){ //Membandingkan nilai di dalam array dengan nilai terbesar saat ini. Jika nilai di dalam array lebih besar, maka nilai terbesar diubah menjadi nilai tersebut.
                    terbesar=data[i];
                }
                }
            System.out.println(""); 
            System.out.println("input terbesar adalah:"+terbesar); //Mencetak nilai terbesar yang ditemukan.
}
}

**JOption Pane**
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Komentar yang memberikan informasi tentang lisensi dan template yang digunakan untuk kelas ini.
/**
 * 
 * @author HP 840 G3 //Komentar yang menyatakan penulis dari kelas ini.
 */
import javax.swing.JOptionPane; //Mengimpor kelas JOptionPane dari paket javax.swing yang digunakan untuk menampilkan dialog box untuk menerima input dan menampilkan pesan kepada pengguna.
public class latihan2JOptionPane { //Deklarasi kelas latihan2JOptionPane yang berisi method main. Method main adalah titik awal eksekusi program. 
    public static void main(String[] args){
   int[] a = new int[11]; //Mendeklarasikan array a dan n dengan panjang 11 untuk menyimpan data yang dimasukkan oleh pengguna.

        String[] n = new String[11]; //Mendeklarasikan variabel terbesar dengan nilai awal 0 untuk menyimpan nilai terbesar.

        int terbesar = 0;

        for(int i=1;i+1<=a.length;i++) //Perulangan for untuk meminta pengguna memasukkan data sebanyak 11 kali.

        {
            //Mencetak nomor array yang sedang dimasukkan.
            System.out.println(i); //menampilkan array ke

            n[i] = JOptionPane.showInputDialog("Masukkan angka ke-"+i+" :"); //Menampilkan dialog box JOptionPane untuk meminta pengguna memasukkan angka.

            a[i] = Integer.parseInt(n[i]); //Mengonversi angka yang dimasukkan oleh pengguna menjadi tipe data int dan menyimpannya di dalam array a pada indeks yang sesuai.
            //Memeriksa apakah nilai terbesar saat ini lebih besar daripada nilai yang baru saja dimasukkan oleh pengguna. Jika iya, maka nilai terbesar tetap tidak berubah dan dicetak di command line.
            if(terbesar>a[i])

            {

                if(terbesar>a[i])

                {

                terbesar=terbesar;
               
                System.out.println(terbesar); //menampilkan terbesar dicommandline

                }

            }

            else

            {

                if(a[i]>a[i-1])

                {

                terbesar=a[i];

                }

                else

                {

                terbesar=a[i-1];
                
// Jika nilai yang baru saja dimasukkan oleh pengguna lebih besar dari nilai sebelumnya dalam array, maka nilai terbesar diubah menjadi nilai tersebut. Jika tidak, nilai terbesar tetap sama dengan nilai sebelumnya dalam array. Nilai terbesar kemudian dicetak di command line.

                }

                System.out.println(terbesar); //menampilkan terbesar di commandline

            }

        }
        //Membuat string hasil yang berisi pesan yang mengandung nilai terbesar yang ditemukan.
        String hasil="Nilai Terbesar adalah "+terbesar;
        //Menampilkan dialog box JOptionPane yang menampilkan pesan hasil.
        JOptionPane.showMessageDialog(null,hasil);           

    }

}

modul 7.7.3 Buku Alamat

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Komentar yang memberikan informasi tentang lisensi dan template yang digunakan untuk kelas ini.
/**
 *
 * @author HP 840 G3 /Komentar yang menyatakan penulis dari kelas ini.
 */
public class latihan3 { //Deklarasi kelas "latihan3" yang berisi method "main". Method "main" adalah titik awal eksekusi program. 
    public static void main(String[] args) {
    //Deklarasi dan inisialisasi array dua dimensi "alamat" yang menyimpan informasi nama, nomor telepon, dan alamat beberapa orang.
     String alamat[][] = {{"Florence", "735-1234", "Manila"}, {"Joyce", "983-3333", "Quezon City"},{"Becca", "456-3322", "Manila"}};
int i=0; //Deklarasi variabel "i" dengan nilai awal 0.
do{
//Mencetak informasi nama, nomor telepon, dan alamat orang yang terdapat dalam array "alamat" pada indeks "i".
System.out.println("name    :" + alamat[i][0] ); //
System.out.println("Tel. #  :" + alamat[i][1] );
System.out.println("Address :" + alamat[i][2] );
System.out.println(" "); //Mencetak baris kosong untuk pemisah.
i++; //Meningkatkan nilai "i" sebesar 1.
}
while (i<3); //Kondisi perulangan do-while. Perulangan akan terus berjalan selama nilai "i" kurang dari 3.
}
}
