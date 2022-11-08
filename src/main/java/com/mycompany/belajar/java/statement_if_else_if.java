/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java;

import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class statement_if_else_if {
    
    public static void main(String args[]){
        
        String input = JOptionPane.showInputDialog("Nilai = ");
        int nilai = Integer.parseInt(input);
        String grade = "";
        
        if(nilai > 85){
            grade = "A";
        } else if(nilai >= 75){
            grade = "B";
        } else {
            grade = "E";
        }
        
        System.out.println("Nilai = " + nilai);
        System.out.println("Grade = " + grade);
        System.exit(0);
        
    }
}
