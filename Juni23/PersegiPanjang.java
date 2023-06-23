/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juni23;

/**
 *
 * @author HP 840 G3
 */
public class PersegiPanjang implements Relation{
    private float panjang;
    private float lebar;

    public PersegiPanjang() {
    }

    

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public float getLuas(){
        return panjang * lebar;
    }
    
    public float getKeliling(){
        return (2*panjang)+(2*lebar);
    }

    @Override
    public boolean isGreater(Object a, Object b) {
        float luas_a = ((PersegiPanjang) a).getLuas();
        float luas_b = ((PersegiPanjang) b).getLuas();
        return luas_a > luas_b;
    }

    @Override
    public boolean isLess(Object a, Object b) {
        float luas_a = ((PersegiPanjang) a).getLuas();
        float luas_b = ((PersegiPanjang) b).getLuas();
        return luas_a < luas_b;
    }

    @Override
    public boolean isEqual(Object a, Object b) {
        float luas_a = ((PersegiPanjang) a).getLuas();
        float luas_b = ((PersegiPanjang) b).getLuas();
        return luas_a == luas_b;
    }
    
    public static void main(String[] args) {
        PersegiPanjang p1 = new PersegiPanjang(5, 2);
        PersegiPanjang p2 = new PersegiPanjang(4, 3);
        Relation r = new PersegiPanjang();
        System.out.println("Luas p1 > luas p2" + r.isGreater(p1, p2) );
        System.out.println("Luas p1 < luas p2" + r.isLess(p1, p2) );
    }
    
}
