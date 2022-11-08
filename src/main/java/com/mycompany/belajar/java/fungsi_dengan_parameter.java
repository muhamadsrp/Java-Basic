/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar.java;

/**
 *
 * @author Admin
 */
public class fungsi_dengan_parameter {
    public void test(int data){
        int nilai = 1;
        if(data == 0 | data == 1){
            nilai = 1;       
        }else{
            for(int i=1; i<=data; i++){
                nilai*=1;
            }
        }
        System.out.println(data + " != " + nilai);
    }
    public static void main(String args[]){
        fungsi_dengan_parameter f5 = new fungsi_dengan_parameter();
        f5.test(4);
        f5.test(5);
    }
}
