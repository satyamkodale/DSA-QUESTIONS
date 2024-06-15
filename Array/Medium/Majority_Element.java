/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Array.Medium;

import java.util.*;


class BrutForce
{
    public int findBrutForceMajority(int[] v)
    {
         Arrays.sort(v);
        int ccount=0;
        int element=v[0];
        int n=v.length/2;

       int toreturn =0;

        for(int i=0; i<v.length; i++)
        {
            if(element==v[i])
            {
                ccount++;
                if(ccount>=n)
                {
                    toreturn = v[i];
                    break;
                }
            }
           else
           {
               element=v[i];
               ccount=1;
                if(ccount>=n)
                {
                    toreturn=v[i];
                    break;
                }
           }
        }

        return toreturn;
        
        
    }
}
class Better{
    
    public int findBettermajority(int [] v){
    int n = v.length;

       Map<Integer,Integer> map = new HashMap<>();


       for(int i =0; i<n; i++)
       {
           int value = map.getOrDefault(v[i],0);
           map.put(v[i],value+1);

       }





       for(Map.Entry<Integer,Integer> it:map.entrySet())
       {
           if(it.getValue() > (n/2))
           {
               return it.getKey();
           }

       }

      return -1;

    }
        
}





public class Majority_Element
{
    
    //optimal 
   


    public static int majorityElement(int []v) {
        //size of the given array:
        int n = v.length;
        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i]) cnt++;
            else cnt--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }

}

    
    

