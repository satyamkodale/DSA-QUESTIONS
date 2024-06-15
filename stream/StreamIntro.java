/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.stream;

/**
 *
 * @author Satyam
 */
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamIntro {
    public static void main(String [] args)
    {
        //Collection is used to represent a group of objects as a single entity.
        
        //Stream is used to process the objects from collection
        //stream concept is used where ever their are group of a value 
        
        // Stream s =c.stream(); -> used to get stream
        
       
        
        
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(3);
        list.add(5);
        list.add(7);
        
        Integer[] toArray1 =list.stream().toArray(Integer[]::new);
        System.out.println("converting collection to array");
        System.out.println(toArray1);
        System.out.println("Printing array by streams");
        Stream.of(toArray1).forEach(System.out::println);
   
        
        System.out.println(list);
        System.out.println("to filter ");
        List<Integer> list2 =list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list2);
        
        System.out.println("if you want to perform operation for every object then go for map"); 
         List<Integer> list3 =list.stream().map(i->i+5).collect(Collectors.toList());
         System.out.println(list2);
         // we can do both at same time 
         List<Integer> list4 =list.stream().filter(i->i%2==0).map(i->i+5).collect(Collectors.toList());
         
         long count = list.stream().filter(i->i%2==0).count();
         
          System.out.println(count+"count method ");
          
         List<Integer> list5=  list.stream().sorted().collect(Collectors.toList());
         
          System.out.println(list5+"sorting asec");
          
           List<Integer> list6=  list.stream().sorted((i1,i2)->(i1<i2)?1:(i2<i1)?-1:0).collect(Collectors.toList());
          System.out.println("descending"+list6);
         
          System.out.println("min");
         Integer min = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
         // if you sort for any sorting aesc/desc it always return min-> means first value and max-> last value 
           System.out.println(min);
         Integer descmin = list.stream().min((i1,i2)->-i1.compareTo(i2)).get();
       
          System.out.println(descmin);
         
         list.stream().forEach(System.out::println);
         //forEach(Function); --> we can repalce with lambda / ::

        Integer[] toArray =list.stream().toArray(Integer[]::new);
        System.out.println("converting collection to array");
        System.out.println(toArray);
        System.out.println("Printing array by streams");
        Stream.of(toArray).forEach(System.out::println);
          
        
        Stream s =Stream.of(1,2,3,4,5,67,8);
        s.forEach(System.out::println);
        System.out.println("Stream of on group of  number ");
        
    }
    
}
