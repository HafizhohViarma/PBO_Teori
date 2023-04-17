/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 840 G3
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class latihan2BufferedReader {
    public static void main(String[] args){
        BufferedReader masukan=new BufferedReader(new InputStreamReader(System.in));
         int data[]=new int[10];
        String input="";
            for (int i=0;i<data.length;i++){
                System.out.print("masukan data ke "+(i+1)+":");
            try{
                input=masukan.readLine();
                data[i]=Integer.parseInt(input);
            }catch (Exception e){              
                }
            }
            int terbesar =data[0];
            for (int i=0;i<data.length;i++){
                if(data[i]>terbesar){
                    terbesar=data[i];
                }
                }
            System.out.println("");
            System.out.println("input terbesar adalah:"+terbesar);
}
}
