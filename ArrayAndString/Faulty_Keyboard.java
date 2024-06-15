package com.javadsa.ArrayAndString;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satyam
 */
public class Faulty_Keyboard {
    public static void main(String [] args)
    {
    String s= new String("Satyam");
    System.out.println(s.charAt(0));
    String result=s;
    System.out.println(result);
    
    String replaced=s.replace(s.charAt(0), s.charAt(2));
    System.out.println(s);
        System.out.println(replaced);
        
    
    
    
    }
    
}
