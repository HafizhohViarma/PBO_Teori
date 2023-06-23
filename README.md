MODUL 11

CIRCLE.JAVA

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ //komentar yang memberikan instruksi tentang bagaimana mengubah lisensi dan template untuk kelas Java ini.
package AbstractClass; //menentukan package di mana kelas Circle akan berada. Package ini digunakan untuk mengelompokkan kelas-kelas yang terkait secara logis.

/**
 *
 * @author HP 840 G3 //adalah komentar Javadoc yang memberikan informasi tentang penulis (author) kelas ini.     
 */
public class Circle { //mendeklarasikan kelas Circle. Kelas ini mewakili sebuah lingkaran dan memiliki beberapa metode yang mengembalikan informasi tentang lingkaran tersebut.
     private double radius; /mendeklarasikan variabel instance "radius" yang bertipe data double. Variabel ini digunakan untuk menyimpan nilai jari-jari lingkaran.

    public Circle(double radius) {
        this.radius = radius;
    }
   //kode diatas adalah konstruktor kelas Circle. Konstruktor ini menerima argumen "radius" dan menginisialisasi variabel instance "radius" dengan nilai yang diberikan.

    public double getArea() {
        return 3.14 * radius * radius;
    }
   //Kode di atas adalah metode "getArea" yang mengembalikan luas lingkaran. Rumus yang digunakan untuk menghitung luas lingkaran adalah π * r^2, di mana π (pi) adalah konstanta yang diwakili oleh nilai 3.14 dan r adalah jari-jari lingkaran.

    public String getName() {
        return "Circle";
    }
   //Kode di atas adalah metode "getName" yang mengembalikan nama lingkaran. Dalam hal ini, nama lingkaran adalah "Circle". Metode ini digunakan untuk mendapatkan informasi tentang jenis bentuk geometri yang diwakili oleh objek Circle.
}

MAIN.JAVA
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ //Kode di atas adalah komentar yang memberikan instruksi tentang bagaimana mengubah lisensi dan template untuk kelas Java ini.
package AbstractClass; //menentukan package di mana kelas Main akan berada. Package ini digunakan untuk mengelompokkan kelas-kelas yang terkait secara logis.

/**
 *
 * @author HP 840 G3 //komentar Javadoc yang memberikan informasi tentang penulis (author) kelas ini.
 */
public class Main { //mendeklarasikan kelas Main. Kelas ini berfungsi sebagai kelas utama (entry point) yang akan dieksekusi saat program dijalankan.

//Kode di bawah adalah metode main yang merupakan titik masuk (entry point) program. Ketika program dijalankan, metode main akan dieksekusi. Di dalam metode main, terdapat beberapa baris kode yang membuat objek Circle dan Square, dan kemudian mencetak informasi tentang luas kedua bentuk geometri tersebut.
     public static void main(String[] args) {
        Circle circle = new Circle(10); //membuat objek Circle baru dengan jari-jari 10. Objek ini akan digunakan untuk menghitung luas lingkaran.
        System.out.println("Area of " + circle.getName() + ": " + circle.getArea()); //mencetak informasi tentang lingkaran, yaitu nama lingkaran (didapatkan melalui metode getName) dan luas lingkaran (didapatkan melalui metode getArea).

        Square square = new Square(5); /membuat objek Square baru dengan panjang sisi 5. Objek ini akan digunakan untuk menghitung luas persegi.
        System.out.println("Area of " + square.getName() + ": " + square.getArea()); //mencetak informasi tentang persegi, yaitu nama persegi (didapatkan melalui metode getName) dan luas persegi (didapatkan melalui metode getArea).
    }
}

SHAPE.JAVA

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ //komentar yang memberikan instruksi tentang bagaimana mengubah lisensi dan template untuk kelas Java ini.
package AbstractClass; /menentukan package di mana kelas-kelas berikutnya akan berada. Package ini digunakan untuk mengelompokkan kelas-kelas yang terkait secara logis.

/**
 *
 * @author HP 840 G3 //komentar Javadoc yang memberikan informasi tentang penulis (author) kelas ini.

//mendefinisikan kelas abstrak "Shape". Kelas ini memiliki dua metode abstrak, yaitu "getArea()" yang mengembalikan luas bentuk geometri dan "getName()" yang mengembalikan nama bentuk geometri. Kelas ini tidak dapat diinstansiasi langsung karena merupakan kelas abstrak.
abstract class Shape {
    public abstract double getArea();
    public abstract String getName();
}

//mendefinisikan kelas "Circle" yang mewarisi kelas "Shape". Kelas ini memiliki variabel instance "radius" yang digunakan untuk menyimpan nilai jari-jari lingkaran. Kelas ini mengimplementasikan metode-metode abstrak dari kelas "Shape", yaitu "getArea()" untuk menghitung luas lingkaran dan "getName()" untuk mengembalikan nama lingkaran.
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public String getName() {
        return "Circle";
    }
}

//mendefinisikan kelas "Square" yang mewarisi kelas "Shape". Kelas ini memiliki variabel instance "side" yang digunakan untuk menyimpan nilai panjang sisi persegi. Kelas ini mengimplementasikan metode-metode abstrak dari kelas "Shape", yaitu "getArea()" untuk menghitung luas persegi dan "getName()" untuk mengembalikan nama persegi.

//Dengan menggunakan konsep abstraksi dan pewarisan, kita dapat membuat berbagai bentuk geometri yang berbeda dengan menggunakan kelas abstrak "Shape" sebagai kerangka dasar, dan kemudian meneruskannya ke kelas turunan seperti "Circle" dan "Square" untuk mengimplementasikan fungsionalitas khusus dari masing-masing bentuk geometri tersebut.
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public String getName() {
        return "Square";
    }
}

SQUARE.JAVA

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */ / komentar yang memberikan instruksi tentang bagaimana mengubah lisensi dan template untuk kelas Java ini. 
package AbstractClass; //menentukan package di mana kelas "Square" akan berada. Package ini digunakan untuk mengelompokkan kelas-kelas yang terkait secara logis.

/**
 *
 * @author HP 840 G3 //komentar Javadoc yang memberikan informasi tentang penulis (author) kelas ini.

//mendefinisikan kelas "Square". Kelas ini memiliki variabel instance "side" yang digunakan untuk menyimpan nilai panjang sisi persegi. Kelas ini memiliki konstruktor untuk menginisialisasi nilai sisi saat objek dibuat. Selain itu, kelas ini memiliki dua metode, yaitu "getArea()" untuk menghitung luas persegi berdasarkan nilai sisi dan "getName()" untuk mengembalikan nama "Square".

//Perbedaan utama antara kelas "Square" ini dengan kelas "Square" yang ada pada kode sebelumnya adalah bahwa kelas "Square" yang ini tidak mewarisi kelas abstrak "Shape". Oleh karena itu, kelas "Square" ini tidak terkait dengan konsep abstraksi dan pewarisan yang ada pada kode sebelumnya.
public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public String getName() {
        return "Square";
    }
}
