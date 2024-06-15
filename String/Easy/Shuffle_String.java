/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.String.Easy;

import java.util.Arrays;

/**
 *
 * @author Satyam
 */
public class Shuffle_String {
    
     public String restoreString(String s, int[] indices)
     
    {
        char [] toString = new char[s.length()];
        for(int i=0; i<s.length();i++)
        {
            toString[indices[i]]=s.charAt(i);
        }
        
        return new String(toString);
    }
    public static void main(String [] args)
    {

        
    
    
    }
}
