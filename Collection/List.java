/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Collection;

// if you want to represent a gorup of individival object as a single entity 
import java.util.*;

//where duplicates are alloweded and insertion order must be preserved
//go for list 
//implementation classes
//>ArrayList
//>LinkedList
//>Vector
//  ->Stack
class List {

    public static void main(String[] args) {

       
//========================================================================================================



        // ArrayList 
        // advantage --> used for fast retrival operation of ele 
        // disadvantage --> if frequent operation is update boz it tranfer element with next cell 
        // duplicates are allowed 
        // insertion order is preserved inserted the obj based of index
        // hetro genius obj are allowed
//            ArrayList <Integer> al = new ArrayList<>();
//            al.clear();
//           with capacity 
//           ArrayList <Integer> al1 = new ArrayList<>(100);
//           System.out.println(al1.size()+"size of al");                 
//           
//            creates for other collection
//           any collection obj 
//                   
//           ArrayList <Integer> al2 = new ArrayList<>(Collection c );

//

//           
//     

//========================================================================================================
        //LinkedList
        //best choice if you want to perform insertion and deletion in middle
        //from 1.5 onwords linkedlist implements Queue
        // duplicates allowed 
        // 1  LinkedList l = new LinkedList();
        //2  LinkedList l = new LinkedList(Collection c);
     LinkedList l = new LinkedList<>();
     
     
      
      
//
//        //methods
//        l.addFirst(1);
//        l.addLast(10);
//        System.out.println(l.getFirst());
//        System.out.println(l.getLast());
//        System.out.println(l.removeFirst() + "removed 1st");
//        System.out.println(l.removeLast() + "removed 1st");
//        
//
//        l.add(1);
//        System.out.println(l.get(0));
//        l.add("d");
//        l.add("r");
//        l.add(1, 1);
//        l.add(2, "e");
//        System.out.println(l);

// op 
//run:
//1
//10
//1removed 1st
//10removed 1st
//1
//[1, 1, e, d, r]


//========================================================================================================

//  Vector 
// insertion order is preserved but duplicates are allowed
// vector is a thread safe and arraylist is not .
//        Vector v = new Vector();
//        System.out.println(v.capacity()+"capacity");
//        v.addElement(1);
//        v.addElement(1);
//        System.out.println(v);
//        
//        v.addElement(1);
//        v.removeElementAt(2);
//        v.removeElement(1);
//        
//        System.out.println(v.capacity()+"capacity");
//        



//====================================================================================================================



//           Stack
//           all properties of stack
//           LastInFirstOut

System.out.println("stack started-------------------->");
     Stack s = new Stack();
       s.add(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.pop();

       System.out.println(s.peek() + "  peek");

        System.out.println(s.empty());

        System.out.println(s);
        s.add(6);
        s.add(5, 5.5);
         System.out.println(s);
         s.capacity();
         s.size();
         System.out.println(s.contains(5.5));
         System.out.println(s.firstElement());
       System.out.println(  s.get(3));
      
         

          










    }
}
