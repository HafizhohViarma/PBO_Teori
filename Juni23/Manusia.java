/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juni23;

/**
 *
 * @author HP 840 G3
 */
public class Manusia extends MakhlukHidup {
    public void jalan(){
        System.out.println("Berjalan Manusia");
    }
    
    public static void main(String[] args) {
        Manusia m = new Manusia();
        m.bernafas();
        m.jalan();
    }
}

