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
public class evenoroddbyAnd {
    public static void evenodd(int num)
    {
         if((num&1)==1)
        {
            System.out.println("odd");
        }else
        {
        System.out.println("even");

        }
    }
    public static void main(String[] arg)
    {
        int num=19;
//         evenoroddbyAnd a = new  evenoroddbyAnd();
//          a.evenodd(num);
      evenodd(num);
    }
    
}
