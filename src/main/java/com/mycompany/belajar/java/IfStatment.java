package com.mycompany.belajar.java;


/*
IntelliJ IDEA 2024.2.0.2 (Community Edition)
Build #IC-242.20224.419, built on August 19, 2024
@Author user a.k.a. Muhamad Saripudin
Java Developer
Created on 31/08/2024 17:49
@Last Modified 31/08/2024 17:49
Version 1.0
*/

public class IfStatment {
    public static void main(String[] args) {

        int nilai = 100;
        int absen = 60;

        if (nilai >= 100 && absen >= 100) {
            System.out.print("PERFECT!!!");
        } else if (nilai >= 75 && absen >= 75){
            System.out.println(
                    "Anda lulus dengan nilai : " + nilai +" / "+ absen
                    );
        } else {
            System.out.println("Coba nanti");
        }


    }
}
