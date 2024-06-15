/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Collection;

/**
 *
 * @author Satyam
 */
import java.util.*;
public class Set
{
    
    
//    set(I)
//          ->HashSet(C)
//                   ->LinkedHashSet(C)
//          ->SortedSet(I)
//                      ->NavigableSet(I)
//                                    ->TreeSet(C)
    
//    used to represent any group of individual object 
//    where duplicates are not allowed
// insertion order is not preserved

    
    
// doesn't have any new methods all methods of collection interface are available
//b add(Object o);
//b addAll(C c);
//b remove(i);
//b remove All(C c);
//clear();
//b contains(Object o);
//b containsAll(Collection c);
//b isEmpty();
//i size ;
//o[] toArray();
//Itr iterator();
    
   
    
        // HashSet.(c)
//        best choice for serach operation.
//        duplicate's not allowed  -> if tried we won't get any error it simply return false.
//        insertion order not preserved -> inserted via hashcode.
     
        // constructors
//        HashSet hs =new HashSet();
//        HashSet hs =new HashSet(initial cap);
//        HashSet hs =new HashSet(initial cap , fill ratio);
//        HashSet hs =new HashSet(C c);

    
         // LinkedHashSet(C)
//        Duplicates aren't allowed
//        But Insertion order must be Preserved
    
         // constructors 
//      same as HashSet
    
    
    
    
        //SortedSet(I)
//  Duplicates are not allowed
// but insertion is based on some some sorting order default--> int -ase String ->ascii
      
    
        // constructors 
//      same as HashSet
    
         //methods
//O first();
//O last();
//SortedSet headSet(ObjectSet)  ->(100,101,104,106)
    //headSet(104)-->[100,101]
//SortedSet tailSet(ObjectSet)  ->(100,101,104,106)
    //tailSet(104)-->[104,106]
//SortedSet subSet(O o1,O o2)         ->(100,101,104,106)
    //returns ele>=o1&<o2
    //subSet(100,106)-->[100,101,104]
    
    
    
        //TreeSet(C)
//hetrogenius Objects are onlu allowed
// All obj inserted based on some sorting order
    //it may be defalut 
    //or By Comparator
//Duplicates Obj are not allowed
    
    
        //Constructor
//TreeSet t = new TreeSet();
//TreeSet t = new TreeSet(Comparator c);
//TreeSet t = new TreeSet(Comparator c);
//TreeSet t = new TreeSet(Collection c);
//TreeSet t = new TreeSet(SortedSet s);
    
//        it implements Comparable(I)
         // obj1.compareTo(Obj2);
          //-ve->obj1 comes before obj2
          //+ve->obj1 comes after obj2
          //0-> both are equal
    
          //obj1//(new) .compare(obj2);(old)
          // k added
          // z is big +ve then at right of tree
          // a is small -ve at left of tree

    
        // Comparator(I)
    
   
    
//    public myComparator implements Comparator
//            {
//                public int compare(obj1, obj2)
//                {
//                    Integer i1 = (Integer)obj1;
//                    Integer i2 = (Integer)obj2;
//                    //desc
////                    if(i1<i2)
////                    {
////                   return +ve;
////                    }
////                    else if(i1>i2)
////                    {
////                        return -ve;
////                    }
////                    else
////                    {
////                        return 0;
////                    }
//
//                    
//                }
//            
//            }

//for asce obj1.compare(obj2);  / -obj2.compare(obj1);
//for desc -obj1.compare(obj2);/ obj2.compare(obj1);
//for same order return +1;
//for reverse return -1;


//to use 

     
//         p . s. v. m.(S[]a)
//        {    TreeSet ts= new TressSet(new MyComparator);
//
//         }
//                


    
    
    
    
    
    
    
    
// SortedSet(I)
  
    public static void main(String [] args)
    {

        
     System.out.println( (int)Math.ceil(5));
        
        
   
    }
    
}
