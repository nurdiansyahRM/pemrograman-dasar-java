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
    boolean a,b,c;
    
    // OR / atau (||)
    System.out.println("==== OR ====");
    a = false;
    b = false;
    c = (a||b);
    System.out.println(a + " || " + b + " = " + c);
    a = false;
    b = true;
    c = (a||b);
    System.out.println(a + " || " + b + " = " + c);
    a = true;
    b = false;
    c = (a||b);
    System.out.println(a + " || " + b + " = " + c);
    a = true;
    b = true;
    c = (a||b);
    System.out.println(a + " || " + b + " = " + c);
    
    // AND / dan (&&)
    
    System.out.println("==== AND ====");
    a = false;
    b = false;
    c = (a && b);
    System.out.println(a + " && " + b + " = " + c);
    a = false;
    b = true;
    c = (a && b);
    System.out.println(a + " && " + b + " = " + c);
    a = true;
    b = false;
    c = (a && b);
    System.out.println(a + " && " + b + " = " + c);
    a = true;
    b = true;
    c = (a && b);
    System.out.println(a + " && " + b + " = " + c);
    
    //XOR / exlusive or (^) 
    
    System.out.println("==== XOR ====");
    a = false;
    b = false;
    c = (a ^ b);
    System.out.println(a + " ^ " + b + " = " + c);
    a = false;
    b = true;
    c = (a ^ b);
    System.out.println(a + " ^ " + b + " = " + c);
    a = true;
    b = false;
    c = (a ^ b);
    System.out.println(a + " ^ " + b + " = " + c);
    a = true;
    b = true;
    c = (a ^ b);
    System.out.println(a + " ^ " + b + " = " + c);
    
    //not /negasi ---> flipping (!)
    System.out.println("==== NOT ====");
    a = true;
    c = !a;
    System.out.println(a + " --> (!) = " + c);
    
    a = false;
    c = !a;
    
    System.out.println(a + " --> (!) = " + c);
    
    
    
    
    
}    
}
