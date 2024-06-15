
 
package com.javadsa.Array;

import java.util.*;
public class ArrayStart {
    
    public static void main(String [] ar){
//        one diamensional array
//        syntax
//datatype[] arr_name = new datatype [size];
//datatype  []arr_name = new datatype [size];
//datatype  arr_name[] = new datatype [size];

//new used to create object

//       int[] arr1 = new int[10];
//       System.out.println(arr1.getClass().getName());
//       //default value of array elements is 0
//       System.out.println(arr1[1]);
//       System.out.println(arr1);
//       System.out.println(arr1.length);
//       
//       for(int i =0;i<arr1.length; i++)
//       {
//           System.out.println(arr1[i]);
//           
//       }
       
       Scanner sc = new Scanner(System.in);
       int [][] arr = new int [2][3];
//       arr[0][0]=10;
//       arr[0][1]=100;
//       arr[1][0]=1000;
//       arr[1][1]=10000;
       //System.out.println(arr[0][0]);
       System.out.println(arr.length);
       
       for(int i =0; i<arr.length; i++){
           
           for(int j =0; j<arr[i].length;j++){
               System.out.println("enter value for "+"arr["+i+"]["+j+"]");
               arr[i][j]=sc.nextInt();
               
           
           }
           
       }
       
       for(int [] a1:arr)
       {     
           for(int a2 : a1)
           {
               System.out.print(a2);
           
           }
       
           System.out.println("");
       }
       
       
    
       
       
      

        }
    
}
