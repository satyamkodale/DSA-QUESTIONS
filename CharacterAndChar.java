/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa;

/**
 *
 * @author Satyam
 */
import java.util.*;
 public class CharacterAndChar {
     public static void main(String [] args)
    {
    
        Character c1='a';
        Character c2='a';
        //"for equals 
        System.out.println(c1.equals(c2));
        //"for =="
        System.out.println(c1==c2);
        
        
//Parameters:
//anotherCharacter - the Character to be compared. 
//Returns:
//the value 0 if the argument Character is equal to this
// Character; a value less than 0 if this Character is numerically less 
//than the Character argument; and a value greater than 0 if this Character
//is numerically greater than the Character argument (unsigned comparison).
//Note that this is strictly a numerical comparison; it is

         System.out.println(c1.compareTo(c2));
         
         
        Character c5='a';
        Character c6='b';
         //"for equals 
        System.out.println(c5.equals(c6));
        
        
         System.out.println(c5.compareTo(c6));
         System.out.println(c6.compareTo(c5));
         
        //"for =="
        System.out.println(c5==c6);
        
        
            
        
         
        
      
        
        char c3 ='b';
        char c4 ='c';
        
         //"for equals 
       // not available System.out.println(c3.equals(c4));
        //"for =="
        System.out.println(c3==c4);
        
        char c8 ='b';
        char c9 ='b';
        
        System.out.println(c8==c9);
        
        
        
        
        Character c10='a';
        Character c11='a';
        
         System.out.println(c10.equals(c11));
         System.out.println(c10.hashCode()+ " "+ c11.hashCode());
         System.out.println(c10==c11);
         
         c10='b';
         System.out.println(c10.equals(c11));
         System.out.println(c10.hashCode()+ " "+ c11.hashCode());
         System.out.println(c10==c11);
         
         
         Map<Character , Character> map = new HashMap<>();
         
        
    }
    
}
