# PBO_Teori
pbo teori
modul 4
latihan 4.1

/**
 *
 * @author HP 840 G3
 */
public class latihan41 { //<- Ini adalah blok class dengan nama latihan41
    // Blok class dibuka dengan tanda kurung kurawal { kemudian ditutup atau diakhiri dengan }.
    // Di dalam blok class, kita dapat mengisinya dengan method atau fungsi-fungsi dan juga variabel.
    // Pada contoh di bawah, terdapat method main().
    public static void main(String[] args) { // Method main() atau fungsi main() merupakan blok program yang akan dieksekusi pertama kali.
        int number = 10; //ini merupakan Tipe bilangan bulat yg biasanya digunakan untuk bilangan bulat
        char letter = 'a';  //Tipe data karakter tunggal
        boolean result = true; // tipe boolean memiliki dua nilai yaitu benar (true) atau salah (false)
        String str = "hello"; //string merupakan tipe data yang berisikan kumpulan kosong atau lebih karakter.
        
        System.out.println("Number=" +number);  // Ini adalah fungsi untuk menampilkan teks ke layar monitor diikuti oleh variabel yg telah di deklarasikan.
        System.out.println("Letter=" +letter); // Ini adalah fungsi untuk menampilkan teks ke layar monitor diikuti oleh variabel yg telah di deklarasikan.
        System.out.println("result=" +result); // Ini adalah fungsi untuk menampilkan teks ke layar monitor diikuti oleh variabel yg telah di deklarasikan.
        System.out.println("str=" +str); // Ini adalah fungsi untuk menampilkan teks ke layar monitor diikuti oleh variabel yg telah di deklarasikan.
    }
    
    
}


latihan 4.2

/**
 *
 * @author HP 840 G3
 */
public class latihan42 {  //<- Ini adalah blok class dengan nama latihan42
    // Blok class dibuka dengan tanda kurung kurawal { kemudian ditutup atau diakhiri dengan }.
    // Di dalam blok class, kita dapat mengisinya dengan method atau fungsi-fungsi dan juga variabel.
    // Pada contoh di bawah, terdapat method main().
    public static void main(String[] args){  // Method main() atau fungsi main() merupakan blok program yang akan dieksekusi pertama kali.
        int number1=10; //ini merupakan Tipe bilangan bulat yg biasanya digunakan untuk bilangan bulat 
        int number2=20; //ini merupakan Tipe bilangan bulat yg biasanya digunakan untuk bilangan bulat
        int number3=45; //ini merupakan Tipe bilangan bulat yg biasanya digunakan untuk bilangan bulat
        int fathy=(number1+number2+number3)/3; //ini merupakan Tipe bilangan bulat yg biasanya digunakan untuk bilangan bulat. pada tipe ini pendeklarasian dilakukan secara langsung. 
        
        System.out.println("number1="+number1); // Ini adalah fungsi untuk menampilkan teks ke layar monitor diikuti oleh variabel yg telah di deklarasikan.
        System.out.println("number2="+number2); // Ini adalah fungsi untuk menampilkan teks ke layar monitor diikuti oleh variabel yg telah di deklarasikan.
        System.out.println("number3="+number3); // Ini adalah fungsi untuk menampilkan teks ke layar monitor diikuti oleh variabel yg telah di deklarasikan.
        System.out.println("Avarage is="+fathy); // Ini adalah fungsi untuk menampilkan teks ke layar monitor diikuti oleh variabel yg telah di deklarasikan.
    }
    
}


latihan 4.3

/**
 *
 * @author HP 840 G3
 */
public class latihan43 {  //<- Ini adalah blok class dengan nama latihan43
    // Blok class dibuka dengan tanda kurung kurawal { kemudian ditutup atau diakhiri dengan }.
    // Di dalam blok class, kita dapat mengisinya dengan method atau fungsi-fungsi dan juga variabel.
    // Pada contoh di bawah, terdapat method main().
    public static void main(String[] args) {   // Method main() atau fungsi main() merupakan blok program yang akan dieksekusi pertama kali.
        int number1=10; //ini merupakan Tipe bilangan bulat yg biasanya digunakan untuk bilangan bulat
        int number2=23; //ini merupakan Tipe bilangan bulat yg biasanya digunakan untuk bilangan bulat
        int number3=5; //ini merupakan Tipe bilangan bulat yg biasanya digunakan untuk bilangan bulat
        int score=0; //ini merupakan Tipe bilangan bulat yg biasanya digunakan untuk bilangan bulat
        
        score=(number2 > number3)?(number2>number1)? number2:number1:number3; //ini merupakan pendeklarasian score secara langsung
        
        System.out.println("number 1 = "+number1); // Ini adalah fungsi untuk menampilkan teks ke layar monitor diikuti oleh variabel yg telah di deklarasikan.
        System.out.println("number 2 = "+number2); // Ini adalah fungsi untuk menampilkan teks ke layar monitor diikuti oleh variabel yg telah di deklarasikan. 
        System.out.println("number 3 = "+number3); // Ini adalah fungsi untuk menampilkan teks ke layar monitor diikuti oleh variabel yg telah di deklarasikan.
        System.out.println("nilai tertingginya = "+score); // Ini adalah fungsi untuk menampilkan teks ke layar monitor diikuti oleh variabel yg telah di deklarasikan.
    }
    
}

latihan 4.4

/**
 *
 * @author HP 840 G3
 */
public class latihan44 {  //<- Ini adalah blok class dengan nama latihan43
    // Blok class dibuka dengan tanda kurung kurawal { kemudian ditutup atau diakhiri dengan }.
    // Di dalam blok class, kita dapat mengisinya dengan method atau fungsi-fungsi dan juga variabel.
    // Pada contoh di bawah, terdapat method main().
    public static void main(String[] args) { // Method main() atau fungsi main() merupakan blok program yang akan dieksekusi pertama kali.
        System.out.println("1. a / (b ^(c ^ d)) – e + f – (g * h) + i");   // Ini adalah fungsi untuk menampilkan teks ke layar monitor diikuti oleh variabel yg telah di deklarasikan.
        System.out.println("2. (3 * 10) * (2 / 15) – 2 + (4 ^ (2 ^ 2))");  // Ini adalah fungsi untuk menampilkan teks ke layar monitor diikuti oleh variabel yg telah di deklarasikan.
        System.out.println("3. ((r ^ s) * t) / u) – v + (w ^ x) – y++");  // Ini adalah fungsi untuk menampilkan teks ke layar monitor diikuti oleh variabel yg telah di deklarasikan.
    }
}
