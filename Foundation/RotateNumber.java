
package com.javadsa.Foundation;

import java.util.Scanner;


public class RotateNumber {
    public static void main(String [] arg)
    {
       
        Scanner sc = new Scanner(System.in);
      System.out.println("enter a number");
      int num = sc.nextInt();
      System.out.println("enter round to rotate");
     int roatate = sc.nextInt();
     int countnum=num;
      
      
   
      int count=0;
      while(countnum!=0)
      {
         
          countnum=countnum/10;
          count++;
      }
      
      System.out.println(count);
      
      
      int reversednum=0;
      
      while(roatate!=0)
      {
          if(roatate>0){
           
          int digr = num%10;
          num = num/10;
          reversednum=num+digr*(int)Math.pow(10, count-1);
         num=reversednum;
          roatate--;}
          
       if(roatate<0)
         {
              
             int dig = num/(int)Math.pow(10, count-1);
             num =num%(int)Math.pow(10, count-1);
              
             reversednum=num*10+dig;
             num=reversednum;
             roatate++;
         
        }
      }
      
      System.out.println(reversednum);
      
            
}
}
