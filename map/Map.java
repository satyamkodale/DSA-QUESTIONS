package com.javadsa.map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Satyam
 */
import java.util.*;
import java.util.Hashtable;
public class Map {
    
    public static void main(String [] args)
    {
    
//        Map
//        -> HashMap (C)
//                -> LinkedHashMap(c)
//        ->IdentityHashMap(c)
//        -> WeakHashMap(c)
//        ->SortedMap(I)
//                -> TreeMap(c)
//        ->HashTable (Legacy Class)
//                -> properties(C) 
  
      
//        Map-> 
//                is not a child of Collection(I)
//        If you want to represent a group of objects as Key - Value pair we go for Map.
//        Both Key and Value are Object where key cant be duplicated value can be.
//        if we try to insert we dont get any error just value replaces. and returns it if no key present already returns null
        
        
//        Methods->
//        
//                1. Object put(obj key , obj value);
//                
                HashMap<Integer, Integer> map = new HashMap();
        
                map.put(0,1);
                
//                2. void putAll(Map m);
//                to put group of maps
                
//                  3. Object get(Object key)
                map.get(0);
//              return value or null 

                map.getOrDefault(0, 0);
//                if value is present return value else return default value 
                map.remove(0);
//                 return previous value associated with it;
                map.remove(0, 1);
//                return true/false if specifed key with value is presents.
                map.replace(0, 2);
//                 replaces value 
                map.containsKey(0);
//                return true if key is present 
                map.containsValue(1);
//                  returns true if one or more values are present 
                map.isEmpty();
//                ti check map is empty or not 
                map.clear();
//                to clear map
                
                


//             HashMap(C)->
//                we use  if we want to represent key-value without sorting where duplicates are not allowed.
//                insertion order is not maintained.
//             
//                best choice for searching.
//                        
//                    LinkedHashMap(C)->
//                    we wwant to represent key-value where duplicates are not allowed but interstion order must be preserved.
                     
                         
                
             
//       IdentityHashMap(C)-> same as hashmap just to compare objects it used == instead of equals();
//       WeakHashMap(C)-> not eligible for garbage collection.


//               SortedMap(I)-> 
//              if we want to represent group of key - value based on some sorting order which is based on key 
                       
                       
//                       101 = s
//                       103 = a
//                       104 = t
//                       105 = y
                     
                       
//                Object firstKey();
//                -> returns first key
//                      101
                       
//                  Object lastKey();
//                        105
//                     Object headmap(105);
//                     (101, 103, 104)
                       
//                     Object tailMap(103);
//                       103 104 105
                       
//                       Object  floorKey(103)
//                               102
                        
                
//                Treemap(C)
//                      -> is implementation of SortedMap -> uses red balck tree to store object in sorted order based on key  



//                TreeMap<Integer, Integer> tmap = new TreeMap<>();
                
                
//                tmap.floorKey(103);
                
                  
                
               
//         Hashtable<Object, Object> hashtable = new Hashtable<>();
////         -> legacy class cans store hetrogenius values
//             which is unserlaying ds for new hash class
//                 
       

             
             
                 
                  

      TreeMap<Integer,String> treemap = new TreeMap<>();
      treemap.put(2,"A");
      treemap.put( 6,"B");
          treemap.put(7,"A");
      treemap.put( 8,"C");
      
      System.out.println(treemap);
      System.out.println( treemap.firstEntry().getValue());
            System.out.println(treemap.lastEntry().getValue());
                        System.out.println( treemap.size());
                        treemap.remove(treemap.firstEntry().getKey());
                        System.out.println(treemap);
                        treemap.put(12,"A");
                        treemap.put(11,"B");
                        treemap.put( 14,"C");
                        System.out.println(treemap);
                        System.out.println(treemap);


           

     
      
      
            
                
               
        
                  
    
    }
}
