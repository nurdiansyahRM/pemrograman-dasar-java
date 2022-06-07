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
public class main {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int a,b;
        boolean hasilkonparansi;
        
        //operator equal atau persamaan
        
        System.out.println("===PERSAMAAN===");
        System.out.println();
        System.out.println("percobaan 1");
        System.out.println();
        System.out.print("inputkan nilai a: ");
        a = input.nextInt();
        System.out.print("inputkan nilai b: ");
        b = input.nextInt();
        hasilkonparansi = (a == b);
        System.out.printf("%d == %d : %s\n",a,b, hasilkonparansi);
        
        
        System.out.println("percobaan 2");
        System.out.println();
        System.out.print("inputkan nilai a :");
        a = input.nextInt();
        System.out.print("inputkan nilai b: ");
        b = input.nextInt();
        hasilkonparansi = (a == b);
        System.out.printf("%d == %d : %s\n",a,b, hasilkonparansi);
        
        //operator not equal atau pertidaksamaan
   
        System.out.println("===PERTIDAKSAMAAN===");
        System.out.println();
        System.out.println("percobaan 1");
        System.out.println();
        System.out.print("inputkan nilai a: ");
        a = input.nextInt();
        System.out.print("inputkan nilai b: ");
        b = input.nextInt();
        hasilkonparansi = (a != b);
        System.out.printf("%d != %d : %s\n",a,b, hasilkonparansi);
        
        
        System.out.println("percobaan 2");
        System.out.println();
        System.out.print("inputkan nilai a :");
        a = input.nextInt();
        System.out.print("inputkan nilai b: ");
        b = input.nextInt();
        hasilkonparansi = (a != b);
        System.out.printf("%d != %d : %s\n",a,b, hasilkonparansi);
        
        
        //operator lebih dari kurang dari
        
        System.out.println("===KURANG DARI===");
        System.out.println();
        System.out.println();
        System.out.println("percobaan 1");
        System.out.print("inputkan nilai a: ");
        a = input.nextInt();
        System.out.print("inputkan nilai b: ");
        b = input.nextInt();
        hasilkonparansi = (a < b);
        System.out.printf("%d < %d : %s\n",a,b, hasilkonparansi);
        
        
        System.out.println("percobaan 2");
        System.out.println();
        System.out.print("inputkan nilai a :");
        a = input.nextInt();
        System.out.print("inputkan nilai b: ");
        b = input.nextInt();
        hasilkonparansi = (a < b);
        System.out.printf("%d < %d : %s\n",a,b, hasilkonparansi);
        
        //operator lebih dari
        
        System.out.println("===LEBIH DARI===");
        System.out.println();
        System.out.println("percobaan 1");
        System.out.println();
        System.out.print("inputkan nilai a: ");
        a = input.nextInt();
        System.out.print("inputkan nilai b: ");
        b = input.nextInt();
        hasilkonparansi = (a > b);
        System.out.printf("%d > %d : %s\n",a,b, hasilkonparansi);
        
        
        System.out.println("percobaan 2");
        System.out.println();
        System.out.print("inputkan nilai a :");
        a = input.nextInt();
        System.out.print("inputkan nilai b: ");
        b = input.nextInt();
        hasilkonparansi = (a > b);
        System.out.printf("%d > %d : %s\n",a,b, hasilkonparansi);
        
        

        //operator kurang dari sama dengan
        
        
        System.out.println("===KURANG DARI SAMA DENGAN===");
        System.out.println();
        System.out.println("percobaan 1");
        System.out.println();
        System.out.print("inputkan nilai a: ");
        a = input.nextInt();
        System.out.print("inputkan nilai b: ");
        b = input.nextInt();
        hasilkonparansi = (a <= b);
        System.out.printf("%d <= %d : %s\n",a,b, hasilkonparansi);
        
        
        System.out.println("percobaan 2");
        System.out.println();
        System.out.print("inputkan nilai a :");
        a = input.nextInt();
        System.out.print("inputkan nilai b: ");
        b = input.nextInt();
        hasilkonparansi = (a <= b);
        System.out.printf("%d <= %d : %s\n",a,b, hasilkonparansi);
        
        //operator lebih dari sama dengan
        
        System.out.println("===LEBIH DARI SAMA DENGAN===");
        System.out.println();
        System.out.println("percobaan 1");
        System.out.println();
        System.out.print("inputkan nilai a: ");
        a = input.nextInt();
        System.out.print("inputkan nilai b: ");
        b = input.nextInt();
        hasilkonparansi = (a >= b);
        System.out.printf("%d >= %d : %s\n",a,b, hasilkonparansi);
        
        
        
       System.out.println("percobaan 2");
       System.out.println();
       System.out.print("inputkan nilai a :");
        a = input.nextInt();
        System.out.print("inputkan nilai b: ");
        b = input.nextInt();
        hasilkonparansi = (a >= b);
        System.out.printf("%d >= %d : %s\n",a,b, hasilkonparansi);
        
    }
    
}
