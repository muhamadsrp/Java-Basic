package com.mycompany.belajar.java;


/*
IntelliJ IDEA 2024.2.0.2 (Community Edition)
Build #IC-242.20224.419, built on August 19, 2024
@Author user a.k.a. Muhamad Saripudin
Java Developer
Created on 31/08/2024 13:11
@Last Modified 31/08/2024 13:11
Version 1.0
*/

public class KonversiTipeDataNumber {
    public static void main(String[] args) {

        /*
        // Konversi Tipe Data Number
        / - Widening Casting (Otomatis)
            byte -> short -> int -> long -> float -> double
          - Narrowing Casting (Manual) :
            double -> float -> long -> int -> char -> short - > byter
         */

        byte iniByte = 127;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat;
        int iniInt2 = (int) iniLong;
        short iniShort2 = (short) iniInt;
        byte iniByte2 = (byte) iniShort;

    }
}
