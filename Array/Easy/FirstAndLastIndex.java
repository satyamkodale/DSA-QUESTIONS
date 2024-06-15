/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Easy;

/**
 *
 * @author Satyam  more complexity
 * //        while(low<=end)
//        {
//         
//            if(target==mid)
//            {
//                while(!arr[low]=target)
//                {
//                      low++;
//                }
//                
//                while(!arr[end]=target){
//                    end--;
//                }
//                return 
//            
//            }
//            else if(target<mid)
//            {
//                end=mid-1;
//            
//            }
//            else 
//            {
//            low=mid+1;
//            }
//            
//            mid=low+(end-low)/2;
//        
//        
//        }
//    
 */
public class FirstAndLastIndex
{
    public static void main(String[] args)
    {
    
        //optimal
        
        // 10 10 20 20 20 20 20 30 40 40 
//        we need low = 2 index
//        we need high = 6 index
        
//        in normal when we find mid we will stop but now 
        // we mark it as temp value  and agin find 20 in next half if new mid == 20 then now it is new high temp at last low cross the high and temp high is last 20;
        // same for to find low 
        int low=0;
        int high=args.length-1;
        int mid=low+(high-low)/2;
        int target =20;
        
        int hightemp=-1;
        while(low<=high)
        {
           if(target<mid)
           {
           high=mid-1;
           }
           else if(target>mid)
           {
           low=mid+1;
           }
           
           else
           {
               hightemp=mid;
               low=mid+1;
           
           }
        System.out.println(hightemp+"is high");
           
            int lowtemp=-1;
         while(low<=high)
         {
           if(target<mid)
           {
           high=mid-1;
           }
           else if(target>mid)
           {
           low=mid+1;
           }
           
           else
           {
               lowtemp=mid;
               high=mid-1;
           
           }
           
           System.out.println(lowtemp+"is low");
        
          
        }

    
    }
    
}
}