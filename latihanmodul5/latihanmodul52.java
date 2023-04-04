/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 840 G3
 */
import javax.swing.*;
public class latihanmodul52 {
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        name1 = JOptionPane.showInputDialog("Enter Word1");
        name2 = JOptionPane.showInputDialog("Enter Word2");
        name3 = JOptionPane.showInputDialog("Enter Word3");
        System.out.println("Word1 = "+name1);
        System.out.println("Word2 = "+name2);
        System.out.println("Word3 = "+name3);
        
        String msg = name1 + name2 + name3;
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
