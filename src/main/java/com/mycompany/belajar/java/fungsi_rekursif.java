/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java;

/**
 *
 * @author Admin
 */
public class fungsi_rekursif {
    public void tampilString(int sisa){
        if(sisa>0){
            System.out.println("Belajar rekursif Java");
            tampilString(sisa-1);
        }
    }
    public static void main(String args[]){
        fungsi_rekursif r1=new fungsi_rekursif();
        r1.tampilString(5);
    }
}
