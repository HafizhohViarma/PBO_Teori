MODUL 11

PERSON

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ //komentar yang memberikan instruksi tentang bagaimana mengubah lisensi dan template untuk kelas Java ini.     
package Extend.M11; /menentukan package di mana kelas "Person" akan berada. Package ini digunakan untuk mengelompokkan kelas-kelas yang terkait secara logis.

/**
 *
 * @author HP 840 G3 // komentar Javadoc yang memberikan informasi tentang penulis (author) kelas ini.

//mendefinisikan kelas "Person". Kelas ini memiliki dua variabel instance, yaitu "name" dan "address", yang digunakan untuk menyimpan informasi nama dan alamat seseorang. Kelas ini memiliki dua konstruktor, yaitu konstruktor default tanpa parameter yang menginisialisasi nilai "name" dan "address" menjadi string kosong, dan konstruktor dengan parameter yang digunakan untuk menginisialisasi nilai "name" dan "address" dengan nilai yang diberikan.

//Kelas "Person" juga memiliki beberapa metode, antara lain:

//getName(): Metode ini mengembalikan nilai dari variabel "name" dan mencetak pesan "Parent: getName" ke konsol.
//getAddress(): Metode ini mengembalikan nilai dari variabel "address".
//setName(String name): Metode ini mengatur nilai variabel "name" dengan nilai yang diberikan.
//setAddress(String add): Metode ini mengatur nilai variabel "address" dengan nilai yang diberikan.


public class Person {
    
    protected String name;
    protected String address;
    
    public Person(){
        System.out.println("Inside person:Constructor");
        name = "";
        address = "";
        }

        
        public Person( String name, String address ){
        this.name = name;
        this.address = address;
        }

        
        public String getName(){  //fnal berarti tidak boleh override di student
        System.out.println("Parent: getName"); 
        return name;
        }

        public String getAddress(){
        return address;
        }

        public void setName( String name ){
        this.name = name;
        }

        public void setAddress( String add ){
        this.address = add;
        }

}

STUDENT

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ / komentar yang memberikan instruksi tentang bagaimana mengubah lisensi dan template untuk kelas Java ini.
package Extend.M11; //menentukan package di mana kelas "Student" akan berada. Package ini digunakan untuk mengelompokkan kelas-kelas yang terkait secara logis.

/**
 *
 * @author HP 840 G3 //komentar Javadoc yang memberikan informasi tentang penulis (author) kelas ini.
 */
public class Student extends Person{
    public Student(){
        super("Hafizhoh","Solok");
        System.out.println("Inside student:Constructor");
       //beberapa kode di sini
    } 
    
    @Override
    public String getName(){
        System.out.println("Student:getname");
        return name;
    }

    public static void main( String[] args ){
    Student anna = new Student();
    System.out.println("Nama "+anna.name);
    System.out.println("Alamat "+anna.address);
    } 
    
}

//Kode di atas mendefinisikan kelas "Student" yang merupakan subclass dari kelas "Person". Kelas "Student" mewarisi semua variabel dan metode dari kelas "Person" menggunakan kata kunci extends. Dalam hal ini, kelas "Student" mewarisi variabel name dan address serta metode getName(), getAddress(), setName(), dan setAddress() dari kelas "Person".

//Kelas "Student" memiliki konstruktor yang digunakan untuk menginisialisasi variabel name dan address menggunakan konstruktor dari kelas "Person" menggunakan kata kunci super. Konstruktor ini juga mencetak pesan "Inside student:Constructor" ke konsol.

//Metode getName() di-override dengan implementasi khusus untuk kelas "Student". Metode ini mencetak pesan "Student:getname" ke konsol dan mengembalikan nilai variabel name.

//Metode main(String[] args) adalah metode utama yang digunakan untuk menjalankan program. Di dalamnya, sebuah objek anna dari kelas "Student" dibuat. Kemudian, nilai dari variabel name dan address dari objek anna dicetak ke konsol menggunakan System.out.println().

STUDENT RECORD

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ //komentar yang memberikan instruksi tentang bagaimana mengubah lisensi dan template untuk kelas Java ini.
package Extend.M11; // menentukan package di mana kelas "StudentRecord" akan berada. Package ini digunakan untuk mengelompokkan kelas-kelas yang terkait secara logis.

/**
 *
 * @author HP 840 G3 //komentar Javadoc yang memberikan informasi tentang penulis (author) kelas ini.
 */
public class StudentRecord {
    protected String name;
    protected String address;
    protected String age;
        
    public StudentRecord(){
        System.out.println("SuperClass");
    }
    
    public StudentRecord(String name, String address, String age){
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    public StudentRecord(String name){
        this.name = name;
        this.address = "";
        this.age ="";
    }
    
    public String getName(){
        System.out.println("StudentRecord name:" + name);
        return name;
    }
    public String getAddress(){
        return address;
    }
     public String getAge(){
        return age;
    }
     
      
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setAge(String age){
        this.age= age;
    }
}

//Kode di atas mendefinisikan kelas "StudentRecord". Kelas ini memiliki beberapa variabel instance yaitu name, address, dan age, yang memiliki tingkatan akses protected. Tingkatan akses protected memungkinkan variabel tersebut diakses oleh kelas yang mewarisi "StudentRecord".

//Kelas "StudentRecord" memiliki beberapa konstruktor dengan berbagai parameter. Konstruktor tanpa parameter (public StudentRecord()) mencetak pesan "SuperClass" ke konsol.

//Ada juga konstruktor yang menerima tiga parameter (public StudentRecord(String name, String address, String age)) yang digunakan untuk menginisialisasi variabel name, address, dan age menggunakan nilai yang diberikan.

//Konstruktor lainnya adalah konstruktor yang hanya menerima satu parameter (public StudentRecord(String name)) yang digunakan untuk menginisialisasi variabel name dengan nilai yang diberikan, sementara variabel address dan age diatur sebagai string kosong.

//Kelas "StudentRecord" memiliki metode getter dan setter untuk variabel name, address, dan age. Metode getter (getName(), getAddress(), getAge()) digunakan untuk mengambil nilai variabel, sedangkan metode setter (setName(), setAddress(), setAge()) digunakan untuk mengatur nilai variabel.

//Metode getName() mencetak pesan "StudentRecord name: [nilai name]" ke konsol dan mengembalikan nilai variabel name.

//Seluruh kode dalam kelas "StudentRecord" berada di dalam blok kurung {} yang menandakan batasan dari kelas ini.

STUDENT COMPUTER

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ //komentar yang memberikan instruksi tentang bagaimana mengubah lisensi dan template untuk kelas Java ini.
package Extend.M11; //menentukan package di mana kelas "StudentComputer" akan berada. Package ini digunakan untuk mengelompokkan kelas-kelas yang terkait secara logis.

/**
 *
 * @author HP 840 G3 //komentar Javadoc yang memberikan informasi tentang penulis (author) kelas ini.

//mendefinisikan kelas "StudentComputer" yang merupakan turunan dari kelas "StudentRecord". Kelas ini memiliki beberapa variabel instance yaitu network, pbo, web, dan average yang bertipe data double.
public class StudentComputer extends StudentRecord {
   double network;
   double pbo;
   double web;
   double average;
   
   //***NETWORK***//
   public double getNetwork (){
        return network;
    }
    public void setNetwork (double network){
        this.network = network;
    }
    
    //***PBO***//
    //Kelas "StudentComputer" memiliki beberapa metode getter dan setter untuk variabel network, pbo, web, dan average. Metode getter digunakan untuk mengambil nilai dari variabel, sedangkan metode setter digunakan untuk mengatur nilai variabel.
     public double getPbo (){
        return pbo;
    }
    public void setPbo (double pbo){
        this.pbo = pbo;
    }
    
     //***WEB***//
    public double getWeb (){
        return web;
    }
    public void setWeb (double web){
        this.web = web;
    }
    
    
     public double getAverage (){
         average = (web + pbo + network)/3;
        return average;
    }
    public void setAverage (double average){
        this.average = average;
    }
//Kelas "StudentComputer" juga mengimplementasikan metode getName() dengan anotasi @Override. Metode ini akan mencetak nama yang disimpan dalam variabel name dan mengembalikan nilainya.
    @Override
    public String getName(){
        System.out.println("StudentComputer = " + name);
        return name;
    }

    //Metode main() di kelas "StudentComputer" digunakan untuk menguji kelas ini. Di dalamnya, sebuah objek siswa1 dari kelas "StudentComputer" dibuat dan diinisialisasi dengan nilai-nilai menggunakan metode setter. Kemudian, objek siswa1 ditugaskan ke variabel referensi ref dari tipe "StudentRecord". Metode setter setName(), setAddress(), dan setAge() dipanggil melalui variabel ref untuk mengatur nilai nama, alamat, dan umur.
    public static void main(String[] args){
        StudentComputer siswa1 = new StudentComputer();
            siswa1.setNetwork(90);
            siswa1.setPbo(88);
            siswa1.setWeb(96);
           
            StudentRecord ref;
            ref = siswa1;
            ref.setName("Hafizhoh");
            ref.setAddress("Padang");
            ref.setAge("18 Tahun");

            //hasil dari metode getter dan perhitungan rata-rata nilai kompetisi komputer dicetak menggunakan metode println() dari kelas System.out.
            System.out.println("Nama      = " + ref.getName());
            System.out.println("Alamat    = " + ref.getAddress());
            System.out.println("Umur      = " + ref.getAge());
            System.out.println("\nNilai Kompetisi Komputer");
            System.out.println("PBO       = " + siswa1.getPbo());
            System.out.println("NETWORK   = " + siswa1.getNetwork());
            System.out.println("WEB       = " + siswa1.getWeb());
            System.out.println("Rata-rata = " + siswa1.getAverage());    
    }
    
}
