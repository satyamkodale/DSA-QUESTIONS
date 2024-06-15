/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.pattern;

/**
 *
 * @author Satyam
 */
 public class pattern {
    public static void main(String []arg){
        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<=i;j++){
                System.out.print("X ");
            }
            System.out.println("");
        }
        
        System.out.println(".....................................................");
         System.out.println(".....................................................");
        for(int i=4; i>=1;i--)
        {
            
            for(int j=1;j<=i;j++)
            {
                System.out.print("X ");
            }
            System.out.println("");
        
        }
          System.out.println(".....................................................");
         System.out.println(".....................................................");
        
        for(int i=1; i<=4;i++)
        {
            
            for(int j=4;j>=i;j--)
            {
                System.out.print("X ");
            }
            System.out.println("");
        
        }
        
         System.out.println(".....................................................");
         System.out.println(".....................................................");
        for(int i=1;i<=4;i++)
        {
            for(int j=3;j>=i;j--)
            {
                System.out.print("- ");
            }
            for(int j =1; j<=i;j++)
            {
            System.out.print("X ");
            }
            System.out.println(" ");
        
        }
        
        
         System.out.println(".....................................................");
         System.out.println(".....................................................");
         
         for(int i=1;i<=4;i++)
         {
             for(int j =1;j<=i;j++)
             {
             System.out.print("- ");
             }
             for(int j =3;j>=i;j-- )
             {
             System.out.print("X ");
             }
             System.out.println(" ");

                 }
         
          System.out.println(".....................................................");
         System.out.println(".....................................................");
         for(int i=4;i>=1;i--)
         {
             
         
             for(int j=1;j<=i;j++)
             {
             
                 System.out.print("- ");
                 if(j==i)
                 {
                 System.out.println("X");
                 }
             }
         
         
         }
      
    }
    
}
