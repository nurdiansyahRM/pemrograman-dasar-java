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
        Scanner userinput = new Scanner (System.in);
        System.out.println("test");
        //membuat perhitungan luas
        //luas = panjang * luas;
        int panjang,lebar,luas;
        System.out.print("masukan nilai panjang : ");
        panjang = userinput.nextInt();
        System.out.print("masukan nilai lebar : ");
        lebar = userinput.nextInt();
        luas = panjang * lebar;
        System.out.printf("hasil dari luas segi panjang : %d\n", luas);
        
    }
    
    
}
