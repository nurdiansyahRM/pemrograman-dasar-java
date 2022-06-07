/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nurdin;

/**
 *
 * @author cnp-170610
 */
import java.util.Scanner;
import java.util.Locale;
public class main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
    int     var1 = 56;
    double  var2 = 0.543;
    boolean var3 = true;
    char    var4 = 'A';
    String  var5 = "Duniailkom";
    int[]   var6 = {4, 7, 3, 8, 1};
    
    System.out.printf("nilai int = %d \n", var1);
    System.out.printf("nilai double = %.2f  \n", var2);
    System.out.print("nilai bolean = \n" +  var3);
    System.out.printf("nilai char = %c  \n", var4);
    System.out.printf("nilai string= %s  \n", var5);
    
    for(int i : var6){
        System.out.printf(i +" ");
            }   
        
        }
    
    }
    

