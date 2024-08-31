package com.mycompany.belajar.java;


/*
IntelliJ IDEA 2024.2.0.2 (Community Edition)
Build #IC-242.20224.419, built on August 19, 2024
@Author user a.k.a. Muhamad Saripudin
Java Developer
Created on 31/08/2024 18:38
@Last Modified 31/08/2024 18:38
Version 1.0
*/

public class forLoop {
    public static void main(String[] args) {

        int first, mid, last;

        for (first=0; first<=6; first++){
            for (mid=5; mid>=first; mid--) {
                System.out.print(" ");
            }
            for (last=0; last<=first; ++last){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        int i, j, k;

        for (i = 0; i <=6; i++) {
            for (j=0; j<=i; j++){
                System.out.print(" ");
            }
            for (k=6; k>=i; k--){
                System.out.print("o ");
            }
            System.out.println();
        }
        String[] name = {
                "Saya", "Muhamad", "Sarip", "Sedang",
                "Belajar", "Java"
        };
        for (int writed = 0; writed < name.length ; writed++) {
            System.out.print(name[writed] + " ");
        }

    }
}
