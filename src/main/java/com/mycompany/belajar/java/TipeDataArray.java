package com.mycompany.belajar.java;


/*
IntelliJ IDEA 2024.2.0.2 (Community Edition)
Build #IC-242.20224.419, built on August 19, 2024
@Author user a.k.a. Muhamad Saripudin
Java Developer
Created on 31/08/2024 14:47
@Last Modified 31/08/2024 14:47
Version 1.0
*/

public class TipeDataArray {
    public static void main(String[] args) {

        String[] nilai;
        nilai = new String[6];
        nilai[4] = "Tahun ini";

        System.out.print(nilai[4]);
        System.out.println();
        System.out.println("panjang array : " + nilai.length);

    }
}
