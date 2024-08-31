package com.mycompany.belajar.java;


/*
IntelliJ IDEA 2024.2.0.2 (Community Edition)
Build #IC-242.20224.419, built on August 19, 2024
@Author user a.k.a. Muhamad Saripudin
Java Developer
Created on 31/08/2024 22:41
@Last Modified 31/08/2024 22:41
Version 1.0
*/

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {

        int[] iniInt = {
                111, 222, 333, 444, 555
        };
        String[] iniStr = {
                "Muhamad", "Sarip", "Belajar", "Java"
        };

        for (int indexInt = 0; indexInt < iniInt.length; indexInt++) {
            System.out.print(" " + iniInt[indexInt]);
        }
        for (int indexString = 0; indexString < iniStr.length; indexString++) {
            System.out.printf(" " + iniStr[indexString]);
        };
        System.out.println();
        System.out.println("ForEach :");

        for (int indexInteger : iniInt){
            System.out.printf(" " + indexInteger);
        };
        for (String indexStr : iniStr){
            System.out.printf(" " + indexStr);
        }

    }
}
