/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Collection;


public class CursorsOfCollection {
    
//# 3 cursors of java 

//Enumeration

//limitations 
//read only access
//applicable for only legacy classes vector


//Enumeration e = v.elements();

//methods 
//while(e.hasMoreElements())
//{
//      Integer i =(Integer)e.nextElement();
//      Systsem.out.println(i);
//}
//


//iterator

//applicable for collection only 
// read and remove access
//universal cursor

//   Iterator i = anyCollectionOBJ.iterator();
//methods 
//boolean hasNext();
//Object next();
//void remove();

//
//ArrayList <Integer> al2 = new ArrayList<>();
// 
//al2.add(1);
//al2.add(2);
//al2.add(3);
//al2.add(4);
//al2.add(5); 
//al2.add(6);
//
//Iterator i =al2.iterator();
//while(i.hasNext())
//{
//    Integer i1 =(Integer)i.next();
//    if(i1%2==0)
//    {
//        i.remove();
//    
//    }
//    
//    
//}
//  System.out.println(al2);   



//ListIterator

// can work on only list obj 

// can able to do 
//read
//remove
//add
//forword operation
//backword operation

//hasNext();
//next();
//remove();

//Backword operation 

//hasPrevious();
//Object previous();
//hasPrevious();
//previousIndex();

//Forword operation
//add(Object o);-->> after current this object is added

//void set();-->>replace the current obj







    
}
