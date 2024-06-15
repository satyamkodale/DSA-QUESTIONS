/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Collection;

// if you want to represent a gorup of individival object as a single entity 
// go for collection 
// it is a interface 
//which provide some methods to its m=implemntion class



import java.util.*;
public class CollectionMethods 
{
    public static void main(String [] args)
    {
                ArrayList <Integer>al = new ArrayList<>();
                
//1   boolean add(Object o);   
               
               boolean b =al.add(1);
               
               System.out.println(b);
               
               al.add(8);
               
// 2 boolean add(index i,Object o);
// adds at specified index and if element is presnt then it moves to next cell

                al.add(1,3);
                
                 al.add(5);
                
                   al.add(2);
                 
                 al.add(6);
                 
                      al.add(8);
                   al.add(2);
               
                 
// 3 boolean add(index i,Collection c);
                
                
                
                
// 4 boolean remove(Object o);
                
//removes first preference
                Integer i10 = 2;
                boolean b1 =al.remove(i10);
                 System.out.println(b1+"true removed");
                 
                 
                
 // 5 boolean remove(Object o);
               Integer i = al.remove(2);
                System.out.println(i+"Deleted");
               
                
                
// 6  Object get(int index)
// if object not present it retuns null
                Object o = al.get(0);
                 
                System.out.println(o+"   specifed ele at index 0");
                
                
// 7 Object set(int index , Object o)
// replace the item and returns the old item
                
                Object o1 = al.set(0,10);
                System.out.println(o1+"   replaced  ele with 10 at specified index 1");
                
// 8 int indexOf( Object o);
// retuns 1st occurance 
                
                Integer f1 = al.indexOf(2);
                  System.out.println("first occurance of 2 at "+f1);
                 Integer f2=  al.lastIndexOf(2);
                 
                System.out.println("last occurance of 2 at "+f2);
                  
                   System.out.println("=====================================================");
                   System.out.println("printing all elements of list");
                
                for(Integer value : al)
                {
                
                    System.out.println(value);
                }
// 8 int lastIndexOf( Object o);       
                  
                  

                
    
    }
    
    
}
