package com.mycompany.belajar.java;


/*
IntelliJ IDEA 2024.2.0.2 (Community Edition)
Build #IC-242.20224.419, built on August 19, 2024
@Author user a.k.a. Muhamad Saripudin
Java Developer
Created on 31/08/2024 18:10
@Last Modified 31/08/2024 18:10
Version 1.0
*/

public class Switchstatement {
    public static void main(String[] args) {

        int nilai = 85;

        switch (nilai){
            case 100 :
                System.out.println("Nilai anda A");
                break;
            case 90 :
            case 80 :
                System.out.println("Nilai Anda B");
                break;
            case 70 :
                System.out.println("Nilai Anda C");
                break;
            default:
                System.out.println("Nilai Anda D");
        }

    }
}
