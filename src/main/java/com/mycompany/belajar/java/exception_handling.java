/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java;

/**
 *
 * @author Admin
 */
public class exception_handling {
    public static void main(String args[]){
        try{
            int bil = 10;
        System.out.println(bil/0);
        }
        catch(Exception a){
            System.out.println(a.getMessage());
        }
    }  
}
