/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.MathForDSA;

/**
 *
 * @author Satyam
 */
public class AddDigits {
     public int addDigits(int num) {
        

        if(num==0)
        {
          return 0;
        }
        else if(num % 9==0)
        {
            return 9;
        }
        else 
        {
            return num%9;
        }
    }
    
}
