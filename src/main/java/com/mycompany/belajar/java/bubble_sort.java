/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java;

/**
 *
 * @author Admin
 */
public class bubble_sort {
    public static void main(String args[]){
        int a[]= {8,9,5,6,3,4,2,1,7,5};
        for(int i=1; i<a.length; i++){
            for(int h=0;h<a.length-1; h++){
                if(a[h+1]<a[h]){
                    int tmp=a[h+1];
                    a[h+1]= a[h];
                    a[h]=tmp;
                }
            }
        }
        //mencetak hasil
        for(int h=0; h<a.length; h++){
            System.out.println(a[h]+",");
        }
    }
    
}
