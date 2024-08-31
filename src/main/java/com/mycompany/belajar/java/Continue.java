package com.mycompany.belajar.java;


/*
IntelliJ IDEA 2024.2.0.2 (Community Edition)
Build #IC-242.20224.419, built on August 19, 2024
@Author user a.k.a. Muhamad Saripudin
Java Developer
Created on 31/08/2024 21:48
@Last Modified 31/08/2024 21:48
Version 1.0
*/

public class Continue {
    public static void main(String[] args) {

        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 1 ){
                continue;
            }
            System.out.println("Perulangan ganjil : " + i);


        }
        
    }
}
