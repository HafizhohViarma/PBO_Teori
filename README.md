modul 10 
BUKU ALAMAT

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ //Kode di atas adalah komentar yang memberikan instruksi tentang bagaimana mengubah lisensi dan template untuk kelas Java ini.

package HafizhohViarma_05Mei2023; //Kode ini menentukan package di mana kelas BukuAlamat akan berada. Package ini digunakan untuk mengelompokkan kelas-kelas yang terkait secara logis.

/**
 *
 * @author HP 840 G3
 */
public class BukuAlamat { //Kode di atas mendeklarasikan kelas BukuAlamat. Kelas ini memiliki beberapa variabel anggota dan metode.

    /Kode di bawah mendeklarasikan empat variabel anggota dengan tipe data String: nama, alamat, nomor, dan email. Variabel-variabel ini akan menyimpan informasi tentang buku alamat.
    private String nama;
    private String alamat;
    private String nomor;
    private String email;
    
    private static int bukuAlamatTambah; //mendeklarasikan variabel statis dengan tipe data int bernama "bukuAlamatTambah". Variabel ini digunakan untuk menghitung jumlah objek BukuAlamat yang telah dibuat.
    
    public BukuAlamat(){ 
    bukuAlamatTambah++;
    } ////konstruktor default kelas BukuAlamat. Konstruktor ini akan dieksekusi setiap kali objek BukuAlamat dibuat. Di dalam konstruktor ini, variabel "bukuAlamatTambah" akan bertambah satu.
    
//    cara 2
//    public bukuAlamat(String nama, String alamat, String nomor, String email){
//        this.nama = nama;
//        this.alamat = alamat;
//        this.nomor = nomor;
//        this.email = email;
//        bukuAlamatTambah++;
//    }
    
//    public bukuAlamat(String nama, String alamat, String nomor, String email){
//        this.nama = nama; 
//        this.alamat = alamat; 
//        this.nomor = nomor;
//        this.email = email;
//        bukuAlamatTambah++;
//    }
    
    //cara 3
//    public void print(String temp){
//        System.out.println("nama :"+nama);
//        System.out.println("alamat : "+alamat);
//        System.out.println("nomor telepon : "+nomor);
//        System.out.println("email : "+email);
//        bukuAlamatTambah++;
//    }
//    
    

    contoh dari getter dan setter. Getter digunakan untuk mengambil nilai dari variabel nama, sedangkan setter digunakan untuk mengatur nilai variabel nama.
    //cara 1
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getNomor(){
        return nomor;
    }
    public void setNomor(String nomor){
        this.nomor = nomor;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    
}

DATA BUKU ALAMAT

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ //komentar yang memberikan instruksi tentang bagaimana mengubah lisensi dan template untuk kelas Java ini.
package HafizhohViarma_05Mei2023; //menentukan package di mana kelas DataBukuAlamat akan berada. Package ini digunakan untuk mengelompokkan kelas-kelas yang terkait secara logis.

/**
 *
 * @author HP 840 G3 //komentar Javadoc yang memberikan informasi tentang penulis (author) kelas ini.
 */
public class DataBukuAlamat { //mendeklarasikan kelas DataBukuAlamat. Kelas ini memiliki beberapa variabel anggota dan metode.

    private BukuAlamat[] data = new BukuAlamat[100]; 
    private int index;
    //mendeklarasikan dua variabel anggota: "data" yang merupakan array objek BukuAlamat dengan panjang 100, dan "index" yang merupakan indeks saat ini di dalam array data.
   
    public void update(int index, BukuAlamat buku){
        data[index] = buku;
    }
   /Kode di atas adalah sebuah metode "update" yang menerima indeks dan objek BukuAlamat sebagai parameter. Metode ini digunakan untuk mengubah objek BukuAlamat pada indeks yang ditentukan dengan objek BukuAlamat baru.
    
    public void insert(BukuAlamat buku){
        data[index] = buku;
        index++;
//Kode di atas adalah metode "insert" yang menerima objek BukuAlamat sebagai parameter. Metode ini digunakan untuk menyisipkan objek BukuAlamat ke dalam array data pada indeks yang saat ini ditunjukkan oleh variabel "index", kemudian meningkatkan nilai "index" dengan 1.    }

    public BukuAlamat[] getAll(){
        BukuAlamat[] temp = new BukuAlamat[index];
        for(int i=0;i<index;i++){
            temp[i]=data[i];
        }
        return data;
    }
   //Kode di atas adalah metode "getAll" yang mengembalikan array objek BukuAlamat yang berisi semua objek BukuAlamat yang ada dalam array data. Metode ini membuat array baru dengan panjang sesuai dengan nilai "index", kemudian menyalin semua objek BukuAlamat dari array data ke array baru, dan mengembalikan array baru tersebut.
   
    
    public void delete(int index){
        data[index].setNama("");
        data[index].setAlamat("");
        data[index].setNomor("");
        data[index].setEmail("");
    }
   //Kode di atas adalah metode "delete" yang menerima indeks sebagai parameter. Metode ini digunakan untuk menghapus objek BukuAlamat pada indeks yang ditentukan dengan mengatur nilai nama, alamat, nomor, dan email objek tersebut menjadi string kosong.
   
//Kode dibawah adalah metode "main" yang merupakan titik masuk utama program. Di dalam metode ini, beberapa objek BukuAlamat dibuat, diatur nilainya, dan dimasukkan ke dalam objek DataBukuAlamat. Kemudian, daftar objek BukuAlamat yang ada dalam objek DataBukuAlamat ditampilkan ke layar dengan menggunakan metode getAll.
    public static void main(String[] args){
        DataBukuAlamat data = new DataBukuAlamat();
        BukuAlamat temp = new BukuAlamat();
        temp.setNama("ali");
        temp.setAlamat("pasar");
        temp.setNomor("0812345678");
        temp.setEmail("daging99@gamil.com");
        data.insert(temp);
        
        BukuAlamat temp2 = new BukuAlamat();
        temp2.setNama("ani");
        temp2.setAlamat("padang");
        temp2.setNomor("0898765432");
        temp2.setEmail("rahamnilai765@gmail.com");
        data.insert(temp2);
        
        //tampil
        BukuAlamat[] list = data.getAll();
        for(int i=0;i<list.length;i++){
            System.out.println("buku alamat ke---> "+(i+1));
            System.out.println("nama            :"+list[i].getNama());
            System.out.println("alamat          :"+list[i].getAlamat());
            System.out.println("nomor telepon   :"+list[i].getNomor());
            System.out.println("email         : "+list[i].getEmail());
                    
        }
    }
}

MENU BUKU ALAMAT

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ //komentar yang memberikan instruksi tentang bagaimana mengubah lisensi dan template untuk kelas Java ini.
package HafizhohViarma_05Mei2023;  //menentukan package di mana kelas MenuBukuAlamat akan berada. Package ini digunakan untuk mengelompokkan kelas-kelas yang terkait secara logis.

/**
 *
 * @author HP 840 G3 //komentar Javadoc yang memberikan informasi tentang penulis (author) kelas ini.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
//Kode di atas adalah import statement yang digunakan untuk mengimpor kelas-kelas yang diperlukan dari pustaka Java. Dalam kasus ini, kelas BufferedReader dan InputStreamReader digunakan untuk membaca input dari pengguna.

public class MenuBukuAlamat { //Kode di atas mendeklarasikan kelas MenuBukuAlamat. Kelas ini memiliki metode utama (main) yang akan dieksekusi saat program dijalankan.

//Kode di bawah adalah metode "main" yang merupakan titik masuk utama program. Di dalam metode ini, kita membaca input dari pengguna menggunakan kelas BufferedReader dan InputStreamReader. Selanjutnya, kita membuat objek DataBukuAlamat dan menginisialisasi variabel "pil" dengan 0.
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        DataBukuAlamat data = new DataBukuAlamat();
        int pil=0;

        //blok try-catch yang digunakan untuk menangani pengecualian (exception) yang mungkin terjadi dalam blok try. Namun, dalam kode yang diberikan, blok catch tidak melakukan apa pun.
        try {
            
            while(pil!=5){ //perulangan while yang akan terus berjalan selama nilai variabel "pil" tidak sama dengan 5. Dalam setiap iterasi perulangan, menu akan ditampilkan ke pengguna dan input pengguna akan dibaca untuk menentukan tindakan yang diambil.
                System.out.println("1.Input Data");
                System.out.println("2.Hapus Data");
                System.out.println("3.Update Data");
                System.out.println("4.Tampilkan");
                System.out.println("5.Keluar");
                System.out.print("Pilihan Anda ?");
                pil =Integer.parseInt(dataIn.readLine());
                switch(pil){ / switch case yang digunakan untuk memilih tindakan berdasarkan nilai variabel "pil". Dalam kode yang diberikan, hanya kasus 1 dan kasus 4 yang ditangani.
                    case 1:
                        BukuAlamat temp = new BukuAlamat();
                        System.out.print("Nama      :");
                        temp.setNama(dataIn.readLine());
                        System.out.print("Alamat    :");
                        temp.setAlamat(dataIn.readLine());
                        System.out.print("No Telp   :");
                        temp.setNotelp(dataIn.readLine());
                        System.out.print("Email     :");
                        temp.setEmail(dataIn.readLine());
                        data.insert(temp); 
                        break; 
                   //Kode di atas adalah kasus 1 dalam switch case. Jika pengguna memilih pilihan 1, maka akan diminta untuk memasukkan data seperti nama, alamat, nomor telepon, dan email. Objek BukuAlamat baru akan dibuat dan diisi dengan data yang dimasukkan oleh pengguna. Kemudian, objek tersebut akan dimasukkan ke dalam objek DataBukuAlamat menggunakan metode insert.
                    case 4:
                        BukuAlamat[] list = data.getAll();
                        for(int i=0;i<list.length;i++){
                            System.out.println("Buku Alamat ke--->"+(i+1));
                            System.out.println("Nama    :"+list[i].getNama());
                            System.out.println("Alamat  :"+list[i].getAlamat());
                            System.out.println("No Telp :"+list[i].getNotelp());
                            System.out.println("Email   :"+list[i].getEmail());
                        }
                        break;
//Kode di atas adalah kasus 4 dalam switch case. Jika pengguna memilih pilihan 4, maka akan ditampilkan daftar objek BukuAlamat yang ada dalam objek DataBukuAlamat. Objek DataBukuAlamat akan menggunakan metode getAll untuk mendapatkan array dari semua objek BukuAlamat, dan kemudian data dari setiap objek BukuAlamat akan ditampilkan ke layar.    
                        
                }
            }

        } catch (Exception ex) {

        }
    }
}
