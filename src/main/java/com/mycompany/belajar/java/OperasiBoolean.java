package com.mycompany.belajar.java;


/*
IntelliJ IDEA 2024.2.0.2 (Community Edition)
Build #IC-242.20224.419, built on August 19, 2024
@Author user a.k.a. Muhamad Saripudin
Java Developer
Created on 31/08/2024 17:28
@Last Modified 31/08/2024 17:28
Version 1.0
*/

public class OperasiBoolean {
    public static void main(String[] args) {

        int a = 65;
        int b = 65;

        boolean lulusA = a >= 85;
        boolean lulusB = b >= 85;

        boolean lulus = lulusA || lulusB;

        System.out.println(lulus);

    }
}
