
package com.javadsa.MathForDSA;


public class GoogleFlippingNumber 
{
    public static int[][] flipAndInvert(int[][] image)
    {
        int j=0;
        for(int[] row:image)
        {
            for(int i=0;i<(image[j].length +1)/2;i++)
            {
                int temp =row[i]^1;
                row[i]=row[image[j].length-i-1]^1;
                
                row[image[j].length-i-1]=temp;
            
            }
        
        }
      
          
      j++;       
     
    
      return image;
    }
    //for under standing 
//      int [] a={0,1,2,3,4,5,6,7,8,9,10};
//         System.out.println(a.length); 11
//        System.out.println((a.length)/2); 5
//            System.out.println((a.length +1)/2); 6
    public static void main(String [] arg)
    {
        int[][] image= {{1,1,0},{1,0,1},{0,0,0}};
        int[][] imager=flipAndInvert(image);
        
        for(int [] i:imager)
        {
            for(int i1:i)
            {
                System.out.println(i1);
            }
            System.out.println("");
        }
      
      
    }
    
    
    
    
}
