/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.MathForDSA;

import java.util.Scanner;

public class DecimalToAnyBaseBANDViseVarsa
{
    public static void main(String [] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num =sc.nextInt();
        int numc=num;
        System.out.println("In Which base do you want to convert");
        int base =sc.nextInt();
        int rmd=0;
        
     for(int i=0;!(num==0);i++)
     {
          
         rmd+=((num%base)*Math.pow(10, i));
        
         num=num/base;
     }
     
     System.out.println("your decimal number "+numc);
     
     System.out.println("Its base is  "+base+"Converted Number is"+rmd);
  
     
     System.out.println("========================================================================================");
     
     
     System.out.println("Converting Any Base To Decimal");
        System.out.println("Enter a Number");
        int numtoconvert=sc.nextInt();
        int numtoconvertcopy=numtoconvert;
         System.out.println("Enter its base ");
        int baseofnum =sc.nextInt();
        
        int dec=0;
        
        for(int i=0;!(numtoconvert==0);i++)
        {
            dec+=((numtoconvert%10)*Math.pow(baseofnum,i));
            numtoconvert/=10;
        }
          
     System.out.println("your "+baseofnum+" base number "+numtoconvertcopy);
     System.out.println("In decimal is "+dec);
        
     
    
    }
    
}
