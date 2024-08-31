package com.mycompany.belajar.java;


/*
IntelliJ IDEA 2024.2.0.2 (Community Edition)
Build #IC-242.20224.419, built on August 19, 2024
@Author user a.k.a. Muhamad Saripudin
Java Developer
Created on 31/08/2024 21:35
@Last Modified 31/08/2024 21:35
Version 1.0
*/

public class BreakContinue {
    public static void main(String[] args) {

        int i;
        i = 1;

        while (i <= 10) {
            System.out.println(i + " Terulang");
            i++;

            if (i >= 6){
                System.out.println(i + " Perulangan Berhenti");
                break;
            }
        }

    }
}
