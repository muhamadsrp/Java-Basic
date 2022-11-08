/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java;

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Hasil_test_pegawai {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Masukan Jumlah Pegawai : ");
        int n=input.nextInt();
    
        String nama[]= new String[n];
        String status[]= new String[n];
        String nilai[]= new String[n];
    
        for (int i=0;i<n;i++){
             System.out.println("Pegawai Ke : "+(i+1));
            System.out.print("Nama : ");
            nama[i]=input.next();

        int namapegawai = input.nextInt();
    System.out.print("Masukkan Pendidikan Terakhir");
    System.out.print("\n");
    int a = input.nextInt();
    int pendidikan = input.nextInt();
    System.out.print("Masukkan Hasil Nilai Psikotest");
    System.out.print("\n");
    int b = input.nextInt();
    int nilaipsikotest = (int)(b * 0.30);
    System.out.print("Masukkan Hasil Nilai Wawancara");
    System.out.print("\n");
    int c = input.nextInt();
    int nilaiwawancara = (int)(c * 0.30);
    int nilaiakhir = nilaipsikotest + nilaiwawancara;

        if (nilaiakhir >= 70)
    {
      System.out.print("DITERIMA");
      System.out.print("\n");
    }
    else
    {
      System.out.print("TIDAK DITERIMA");
      System.out.print("\n");
    }


        System.out.println("DAFTAR HASIL PEGAWAI");
        System.out.println("======================");
        System.out.println("       No   Nama        Pendidikan      Nilai        Nilai                Status  ");
        System.out.print("\n");
    System.out.print("                                          Psikotes     Wawancara      (DITERIMA/TIDAK DITERIMA)");
    System.out.print("\n");



    }
 }
    
}
