/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Recursion.Basic;


public class PrintNTimesAString 
{
    
    static int a=0; static int b=1;
    public static void fibonaci(int n )
    {
       if(n==0)
       {
           return;
       }
       int sum=a+b;
       System.out.println(sum);
        a=b;
        b=sum;   
       fibonaci(n-1);
    
    }
    
    
    
    
   static int end;
   static int start=0;
  static boolean endAssign=false;
    public static void recurrsionREverseArray(int [] arr)
    {
        if(endAssign==false){
        end=arr.length-1;
        endAssign=true;
        
        }
        if(start>end)
        {
            return;
        }
       int temp=arr[end];
       arr[end]=arr[start];
       arr[start]=temp;
       start++;
       end--;
       recurrsionREverseArray(arr);
       
       
        
        
        
    }
    
     static int sum=0;
    public static int recurrsionS(int n)
    {
        System.out.println(n);
       
        if(n>0){
            sum+=n;
       recurrsionS(n-1);
        }
        return sum;
    }
  
    public static void recurrsionF(int i,int n , String s)
    {
        if(i>n)
        {
            
           return ;  
        }
        System.out.println(s+" "+i);
        recurrsionF(i+1,n,s);
    }
    
    public static void main(String [] args)
    {
        
       recurrsionF(1,10,"satyam");
        int sum=recurrsionS(10);
        System.out.println(sum);

    
        
        
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        recurrsionREverseArray(arr);
        System.out.println("printing reversed array");

        for(int i:arr)
        {
            System.out.print(i);
        
        }
        System.out.println(" fibonacci");
        fibonaci(10);
        
        
       
        
    
    }
    
}
