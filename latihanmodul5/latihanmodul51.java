/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmodul5;

/**
 *
 * @author HP 840 G3
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihanmodul51{


      public static void main (String[] args){
            BufferedReader dataIN = new BufferedReader (new InputStreamReader (System.in));
            String name1 = "";
            String name2 = "";
            String name3 = "";
            
            try{
                System.out.println("Enter Word1=");
                name1=dataIN.readLine();
                System.out.println("Enter Word2=");
                name2=dataIN.readLine();
                System.out.println("Enter Word3");
                name3=dataIN.readLine();
                }catch(IOException e){
                }
            System.out.println(name1 + " " + name2 + " " + name3 + " ");
      }
}