/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java;

/**
 *
 * @author Admin
 */
public class selection_sort {
    public static void main(String args[]){
        int array[]={8,9,5,5,3,4,2,1,7,5};
        int i=0;
        while(i<array.length-1){
            
            int tmp=i;
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[tmp])
                    tmp=j;
            }
            int hlp=array[i];
            array[i]=array[tmp];
            array[tmp]=hlp;
            i++;
        }
        //mencetak hasil
        for(int h=0;h<array.length;h++){
            System.out.println(array[h]+",");
        }
    }
    
}