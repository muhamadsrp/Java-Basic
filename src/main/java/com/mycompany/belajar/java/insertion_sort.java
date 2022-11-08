/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java;

/**
 *
 * @author Admin
 */
public class insertion_sort {
    public static void main(String args[]){
        int a[]={8,5,9,6,3,4,2,1,7,};
        for(int i=0; i<a.length; i++){
            int min=a[i];
            int j=i;
            while((j>0)&&(min<a[j-1])){
                a[j] = a[j-1];
                   j--;
            }
            a[j] = min;
        }
        //mencetak hasil
        for(int h=0; h<a.length; h++){
               System.out.print(a[h] + ", ");
        }
    }
    
}
