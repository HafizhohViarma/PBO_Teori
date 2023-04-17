/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 840 G3
 */
public class latihan1doWhile {
    public static void main(String[] args){
        String hari[] = {
            "senin","selasa","rabu","kamis","jumat","sabtu","minggu"
        };
        int i=0;
        do
            {
                System.out.println(hari[i]);
                i++;
            }while(i<hari.length);
    }
}
