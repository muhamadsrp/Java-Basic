/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class statement_switch {
    public static void main(String args[]){
        
        String pilihan = JOptionPane.showInputDialog(""
            + "Menu (Pilih dengan angka) : \n"
            + "1. Sate Kambing \n"
            + "2. Gulai\n"
            + "3. Sop Kaki Kambing\n"
            + "4. Tongseng");
        int menu = Integer.parseInt(pilihan);
        
        switch(menu){
            case 1 : System.out.println("Anda memilih Sate Kambing");
                break;
            case 2 : System.out.println("Anda memilih Gulai");
                break;
            case 3 : System.out.println("Anda memilih Sop Kaki Kambing");
                break;
            case 4 : System.out.println("Anda Tongseng");
                break;
            default : System.out.println("Maaf, menu tidak ada!");
                break;
        }System.exit(0);
    }
}
