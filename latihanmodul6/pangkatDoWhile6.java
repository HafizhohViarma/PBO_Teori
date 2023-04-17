/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmodul6;

/**
 *
 * @author HP 840 G3
 */
import java.io.*;
public class pangkatDoWhile6 {
    public static void main (String [] args)
    {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int nilai,pangkat,hasil,i;
        
        try{
            System.out.print("masukan angka : ");
            nilai = Integer.parseInt(dataIn.readLine());
            System.out.print("masukan pangkat : ");
            pangkat = Integer.parseInt(dataIn.readLine());
            
          hasil =1;
          i=1;
          do
          {
              hasil = hasil * nilai;
              System.out.println("hasil =" + hasil);
              i++;
          }while (i<=pangkat);
          
        
        }catch(IOException e){
            System.out.println("error");
        }
    
    }
}
