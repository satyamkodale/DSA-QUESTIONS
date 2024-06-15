/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Foundation;

import java.util.Scanner;


//best complexity

class SingleValue
{
    static boolean flag = false;
        
     public static void check(int num1){
       
        for(int i=2; i<=num1/2; i++)
        {
            if(num1==1||num1==0)
            {
            System.out.println("number is either 1/0/ itself is not a prime ");
            return;
            }
            
            if(num1%i==0)
            {
                
                System.out.println("number"+i+" divides so");
                System.out.println("Number is not prime ");  
                 flag = true;
                
                 break;
            }
        
        }
        
        if(flag!=true){
        System.out.println("Number is prime");
        }
        
     }


}

//wrong -->>
//class MultiVal
//{
//    int maxofnum=0;
//    boolean flag =false;
//    
//    public void checkMulti(int[] num){
//        
//        for(int i=0; i<num.length;i++)
//        {
//            if(num[i]>=maxofnum)
//            {
//            maxofnum=num[i];
//            }
//        }
//        
//        
//        for(int i=0;i<=num.length;i++)
//        {
//            
//            for(int j=2; j<maxofnum;j++)
//            {
//            if(num[i]==1||num[i]==0)
//            {
//            System.out.println("number is 1 / 0");
//            return;
//            }
//            if(num[i]%j==0)
//            {
//                System.out.println("number"+j+"can divide so");
//                System.out.println("not prime");
//                flag=true;
//                break;
//            }
//               
//            if(flag!=true){
//            System.out.println("Number is prime");
//            }
//            }
//        
//        }
//        
//    }
 //}
    
    



public class PrimeOrNot {
    public static void main(String [] args){
        
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int  num1 = sc.nextInt();
        
        //prime number is divided by only 1 and itself
        //ex.., 2 , 3,
        //1 not not a prime
        SingleValue.check(num1);
        System.out.println("==========================================================================");
//        int [] arr={2,3,4,5,6,7,8,10};
//        
//      MultiVal m = new MultiVal();
//      m.checkMulti(arr);


System.out.println("enter a value of t to check by less complexity (total number to check)");
     int t=sc.nextInt();; 
     
     boolean flag = false;
     for(int i=1;i<=t;i++)
     { 
         System.out.println("enter a value of " +i+" no.variable");
        int  n =sc.nextInt();
        
        for(int j=2; j*j<=n;j++)
        {
            if(n%j==0)
            {
                System.out.println(n+" is not prime");  
                flag= true;
                break;
                
            }
        
        }
        
        if(flag==false){
        System.out.println(i+" is prime");}
        
     
     
     }

        
    }
    
    
}
