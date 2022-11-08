/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java;

/**
 *
 * @author Admin
 */
public class segitiga {
    public static void main(String[] args){
        for(int i=1; i<=10; i++){
            for(int spasi=0; spasi<=10-i; spasi++){//nilai spasi akan mengikuti nilai i( Jika i semakin besar maka spasi akan semakin berkurang)
                System.out.print(i);//cetak spasi
            }
            for(int k=1; k<=i; k++){
                System.out.print(" " + k);// cetak spasi dan angka counter dari k
            }
            System.out.println();
        }
    }
}