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
public class main {
    public static void main(String[]args){
        //operator bitwise adalah operator untuk melakukan operasi pada nilai bit
        byte a = 1;
        String a_bits;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(oldChar:' ' ,newChar:'0'); 
        System.out.printf("%s = %d", a_bits,a);
    }
    
}
