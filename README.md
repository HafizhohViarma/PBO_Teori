README 23 Juni 2023

MakhlukHidup.Java

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ //komentar yang secara otomatis ditambahkan oleh IDE (Integrated Development Environment) NetBeans. Komentar ini memberikan informasi tentang cara mengubah lisensi dan mengedit template kelas.
package Juni23; //Baris ini menunjukkan bahwa kelas MakhlukHidup berada di dalam paket (package) Juni23. Paket adalah struktur organisasi yang digunakan untuk mengelompokkan kelas-kelas terkait.

/**
 *
 * @author HP 840 G3 //Ini adalah komentar dokumentasi yang memberikan informasi tentang kelas ini. Komentar ini menyatakan bahwa kelas ini dibuat oleh penulis dengan nama "HP 840 G3". Komentar dokumentasi ini juga dapat digunakan untuk menjelaskan fungsionalitas kelas dan metode-metodenya.
 */
public abstract class MakhlukHidup { //Kelas MakhlukHidup dideklarasikan sebagai kelas abstrak dengan kata kunci abstract. Kelas abstrak tidak dapat diinstansiasi langsung, tetapi digunakan sebagai kerangka kerja untuk kelas-kelas turunannya. Kelas abstrak dapat memiliki metode konkrit dan metode abstrak.

    public void bernafas(){
        System.out.println("Bernafas");
    } //Metode bernafas() adalah metode konkrit yang didefinisikan di dalam kelas abstrak MakhlukHidup. Metode ini mencetak teks "Bernafas" ke output konsol.
   
    public abstract void jalan();
   //Metode jalan() adalah metode abstrak yang dideklarasikan di dalam kelas abstrak MakhlukHidup. Metode ini tidak memiliki implementasi di dalam kelas ini, tetapi akan diimplementasikan oleh kelas-kelas turunannya. Kelas turunan yang mengimplementasikan kelas abstrak harus memberikan implementasi untuk semua metode abstrak yang dideklarasikan dalam kelas abstrak tersebut.

//Dengan demikian, kelas abstrak MakhlukHidup memiliki dua metode, yaitu metode konkrit bernafas() dan metode abstrak jalan(). Kelas-kelas turunan dari MakhlukHidup harus memberikan implementasi untuk metode jalan() sesuai dengan kebutuhan mereka.
}

Manusia.Java

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ /Komentar ini mirip dengan yang dijelaskan sebelumnya. Ini adalah komentar yang secara otomatis ditambahkan oleh IDE (Integrated Development Environment) NetBeans. Komentar ini memberikan informasi tentang cara mengubah lisensi dan mengedit template kelas.

package Juni23; //Baris ini menunjukkan bahwa kelas Manusia berada di dalam paket (package) Juni23. Paket adalah struktur organisasi yang digunakan untuk mengelompokkan kelas-kelas terkait.

/**
 *
 * @author HP 840 G3 //Ini adalah komentar dokumentasi yang memberikan informasi tentang kelas ini. Komentar ini menyatakan bahwa kelas ini dibuat oleh penulis dengan nama "HP 840 G3". Komentar dokumentasi ini juga dapat digunakan untuk menjelaskan fungsionalitas kelas dan metode-metodenya.
 * 
 */
public class Manusia extends MakhlukHidup { //Kelas Manusia dideklarasikan sebagai kelas publik yang merupakan turunan dari kelas MakhlukHidup. Dengan kata kunci extends, kelas Manusia mewarisi semua atribut dan metode dari kelas MakhlukHidup. Hal ini berarti kelas Manusia akan memiliki metode bernafas() yang diwarisi dari kelas MakhlukHidup dan harus memberikan implementasi untuk metode abstrak jalan() yang dideklarasikan dalam kelas MakhlukHidup.

    public void jalan(){
        System.out.println("Berjalan Manusia");
    } /Metode jalan() didefinisikan di dalam kelas Manusia. Metode ini memberikan implementasi untuk metode abstrak jalan() yang dideklarasikan dalam kelas MakhlukHidup. Dalam implementasinya, metode ini mencetak teks "Berjalan Manusia" ke output konsol.
    
    public static void main(String[] args) {
        Manusia m = new Manusia();
        m.bernafas();
        m.jalan();
    }
   //Metode main() adalah metode utama yang akan dieksekusi saat program dijalankan. Di dalam metode ini, objek m dari kelas Manusia dibuat menggunakan konstruktor default new Manusia(). Setelah itu, metode bernafas() dan jalan() dipanggil pada objek m untuk mengeksekusi fungsionalitas yang diimplementasikan di dalam kelas Manusia.

//Dengan demikian, kelas Manusia merupakan turunan dari kelas abstrak MakhlukHidup dan mengimplementasikan metode jalan() sesuai dengan kebutuhan kelas tersebut. Dalam metode main(), objek Manusia dibuat dan metode-metode pada objek tersebut dipanggil untuk menunjukkan penggunaan fungsionalitas kelas Manusia.
}

Interface.Java

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ //Komentar ini mirip dengan yang dijelaskan sebelumnya. Ini adalah komentar yang secara otomatis ditambahkan oleh IDE (Integrated Development Environment) NetBeans. Komentar ini memberikan informasi tentang cara mengubah lisensi dan mengedit template kelas.

package Juni23; //Baris ini menunjukkan bahwa interface Relation berada di dalam paket (package) Juni23. Paket adalah struktur organisasi yang digunakan untuk mengelompokkan kelas-kelas terkait.

/**
 * 
 * @author HP 840 G3 //Ini adalah komentar dokumentasi yang memberikan informasi tentang interface ini. Komentar ini menyatakan bahwa interface ini dibuat oleh penulis dengan nama "HP 840 G3". Komentar dokumentasi ini juga dapat digunakan untuk menjelaskan fungsionalitas interface dan metode-metodenya.

java
 */
public interface Relation {
    public boolean isGreater( Object a, Object b); 
    public boolean isLess( Object a, Object b); 
    public boolean isEqual( Object a, Object b);
}
//Interface Relation dideklarasikan dengan kata kunci interface. Interface adalah kontrak yang mendefinisikan metode-metode yang harus diimplementasikan oleh kelas-kelas yang menggunakan interface tersebut.

//Dalam interface Relation, terdapat tiga metode yang harus diimplementasikan oleh kelas-kelas yang mengimplementasikan interface ini:

//Metode isGreater(Object a, Object b) mengambil dua parameter objek a dan b, dan mengembalikan nilai boolean yang menunjukkan apakah a lebih besar dari b.
//Metode isLess(Object a, Object b) mengambil dua parameter objek a dan b, dan mengembalikan nilai boolean yang menunjukkan apakah a lebih kecil dari b.
//Metode isEqual(Object a, Object b) mengambil dua parameter objek a dan b, dan mengembalikan nilai boolean yang menunjukkan apakah a sama dengan b.
//Dengan menggunakan interface Relation, kelas-kelas lain dapat mengimplementasikan metode-metode ini sesuai dengan logika yang diperlukan. Interface ini menyediakan kontrak untuk menggambarkan hubungan relasional antara objek-objek dalam kelas-kelas yang mengimplementasikannya.

PersegiPanjang.Java

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ //Komentar ini mirip dengan yang dijelaskan sebelumnya. Ini adalah komentar yang secara otomatis ditambahkan oleh IDE (Integrated Development Environment) NetBeans. Komentar ini memberikan informasi tentang cara mengubah lisensi dan mengedit template kelas.

package Juni23; //Baris ini menunjukkan bahwa kelas PersegiPanjang berada di dalam paket (package) Juni23. Paket adalah struktur organisasi yang digunakan untuk mengelompokkan kelas-kelas terkait.

/**
 *
 * @author HP 840 G3 //Ini adalah komentar dokumentasi yang memberikan informasi tentang kelas ini. Komentar ini menyatakan bahwa kelas ini dibuat oleh penulis dengan nama "HP 840 G3". Komentar dokumentasi ini juga dapat digunakan untuk menjelaskan fungsionalitas kelas dan metode-metodenya.
 */
public class PersegiPanjang implements Relation{ /Kelas PersegiPanjang dideklarasikan sebagai kelas publik yang mengimplementasikan interface Relation. Dengan menggunakan kata kunci implements, kelas PersegiPanjang menyatakan bahwa akan mengimplementasikan metode-metode yang didefinisikan dalam interface Relation.

    private float panjang;
    private float lebar;
   //Variabel panjang dan lebar adalah variabel private bertipe float yang digunakan untuk menyimpan nilai panjang dan lebar dari persegi panjang.
    
    public PersegiPanjang() {
    } //Ini adalah konstruktor default untuk kelas PersegiPanjang. Konstruktor ini tidak memiliki parameter dan tidak melakukan tindakan apa pun.    

   
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    } //Ini adalah konstruktor lain untuk kelas PersegiPanjang. Konstruktor ini menerima dua parameter panjang dan lebar yang digunakan untuk menginisialisasi variabel instance panjang dan lebar.
    
    public float getLuas(){
        return panjang * lebar;
    }
    
    public float getKeliling(){
        return (2*panjang)+(2*lebar);
    }
    //Metode getLuas() mengembalikan luas persegi panjang dengan mengalikan panjang dengan lebar. Metode getKeliling() mengembalikan keliling persegi panjang dengan menggunakan rumus 2 * panjang + 2 * lebar.
   
    @Override
    public boolean isGreater(Object a, Object b) { ////Metode isGreater() membandingkan luas dua objek persegi panjang a dan b. Metode ini mengambil objek sebagai parameter, mengakses luas persegi panjang menggunakan metode getLuas(), dan membandingkan luasnya menggunakan operator >.
        float luas_a = ((PersegiPanjang) a).getLuas();
        float luas_b = ((PersegiPanjang) b).getLuas();
        return luas_a > luas_b;
    }

    @Override
    public boolean isLess(Object a, Object b) { //Metode isLess() melakukan hal yang sama seperti isGreater(), tetapi menggunakan operator < untuk membandingkan luas persegi panjang.
        float luas_a = ((PersegiPanjang) a).getLuas();
        float luas_b = ((PersegiPanjang) b).getLuas();
        return luas_a < luas_b;
    }

    @Override
    public boolean isEqual(Object a, Object b) { //Metode isEqual() juga melakukan hal yang sama, tetapi menggunakan operator == untuk membandingkan luas persegi panjang.
        float luas_a = ((PersegiPanjang) a).getLuas();
        float luas_b = ((PersegiPanjang) b).getLuas();
        return luas_a == luas_b;
    }
   //Karena kelas PersegiPanjang mengimplementasikan interface Relation, kelas ini harus mengimplementasikan semua metode yang didefinisikan dalam interface tersebut. Metode isGreater(), isLess(), dan isEqual() diimplementasikan dalam kelas PersegiPanjang.
    
    public static void main(String[] args) {
        PersegiPanjang p1 = new PersegiPanjang(5, 2);
        PersegiPanjang p2 = new PersegiPanjang(4, 3);
        Relation r = new PersegiPanjang();
        System.out.println("Luas p1 > luas p2" + r.isGreater(p1, p2) );
        System.out.println("Luas p1 < luas p2" + r.isLess(p1, p2) );
    }
     //Metode main() adalah metode utama yang akan dieksekusi saat program dijalankan. Di dalam metode ini, dua objek PersegiPanjang dibuat menggunakan konstruktor yang menerima panjang dan lebar. Objek p1 memiliki panjang 5 dan lebar 2, sedangkan objek p2 memiliki panjang 4 dan lebar 3.

//Kemudian, objek r dari interface Relation juga dibuat dan diinisialisasi sebagai objek PersegiPanjang. Metode isGreater() dan isLess() dipanggil pada objek r untuk membandingkan luas p1 dan p2, dan hasilnya dicetak ke output konsol.
}
