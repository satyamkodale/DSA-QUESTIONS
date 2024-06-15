/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.Collection;

import java.util.*;
public class Queue 
{
    
//Linkedlist <--implements queue
    
//  Collection
            //-->    Queue (I)
                             //-->PriorityQueue
                                       
      //Queue(I)
// if we want to perform operations of firstinfirstout
// but we can also implement your own queue bases on requirement using --> priority queue  
//    LinkedList, ArrayBlockingQueue and PriorityQueue are the most frequently used implementations.
//    if we want represent qroup of individual objects prior to processing then we should go for queue

       //methods 
// boolean offer(O o);
    //--> adds object to queue
// Object peek();
    //--> to return head element -> if not present -> null
//Object  element();
    //--> to return head element -> if not present -> NOSuchElementFound
//Object poll();
    //--> to remove & return head element -> if empty -> null
//Object remove();
    //--> to remove & return head element -> if empty -> NOSuchElementFound
    
    
      //Iterator  
//     Iterator itr = pq.iterator();
//    System.out.println(pq.size());
//    
//   
//        Iterator iterator = pq.iterator();
// 
//        while (iterator.hasNext()) 
//        {
//           // System.out.println("Performing poll operatiion  "+pq.peek());
//            System.out.println(iterator.next() + " next");
//        }
//}
    
    
      //PriorityQueue
 // two types
    //--> default--> must be homogenius
   // --> Customized(Comparator)
    
//    insertion order is not preserved
    //duplicates not allowed
    
   //Constructor
//    PriorityQueue pq = new PriorityQueue();
//    PriorityQueue pq = new PriorityQueue(int cap);
//    PriorityQueue pq = new PriorityQueue(Comaprator c);
//    PriorityQueue pq = new PriorityQueue(SortedSet s);
//    PriorityQueue pq = new PriorityQueue(C c);

    
    


// Java program to add elements
// to a Queue
 
//import java.util.*;
// 
//public class GFG {
// 
//    public static void main(String args[])
//    {
//        Queue<String> pq = new PriorityQueue<>();
// 
//        pq.add("Geeks");
//        pq.add("For");
//        pq.add("Geeks");
// 
//        System.out.println(pq);
//    }
//}
//    output
 //   [For, Geeks, Geeks]
  
    
  //but problem 
//    ex.1
//  	pq.add("Geeks");
//		pq.add("For");
//      pq.add("App");
//		pq.add("Geeks");
    
//[App, Geeks, For, Geeks]
    
   // ex.2
// pq.add(3);
//		pq.add(10);
//      pq.add(1);
//		pq.add(5);    
//[1, 5, 3, 10]

      // LinkedList implements  Queue
//can hold  hetrogenus objects
// or we can create  homogenus   
// we can use methods of collection as well as queue
    
    
    //ex3 
     
//    PriorityQueue pq = new PriorityQueue();
// 
//    pq.offer(1);
//    pq.offer(5);
//    pq.offer(7);
//    pq.offer(4);
//    pq.offer(10);
//    pq.offer(3);
// 
    
 //   Iterator itr = pq.iterator();
//    System.out.println(pq.size()+" size");
//    
//   
//        Iterator iterator = pq.iterator();
// 
//        while (iterator.hasNext()) 
//        {
//           // System.out.println("Performing poll operatiion  "+pq.peek());
//            System.out.println(iterator.next() + " next");
//        }
    
    
//    output
//    6 size
//1 next
//4 next
//3 next
//5 next
//10 next
//7 next
//    

//    import java.util.LinkedList;
//import java.util.Queue;
//
//public class QueueExample {
//	public static void main(String[] args) {
//		Queue<String> queue = new LinkedList<>();
//        Queue queue1 = new LinkedList<>();
//      
//      // adding elements to Object queue
//      queue1.add(2);
//      queue1.add("apple");
//     queue1.add(3);
//      
//      
//      System.out.println("Object queue"+queue1);
//		// add elements to the queue
//		queue.add("apple");
//		queue.add("banana");
//		queue.add("cherry");
//
//		// print the queue
//		System.out.println("Queue: " + queue);
//
//		// remove the element at the front of the queue
//		String front = queue.remove();
//		System.out.println("Removed element: " + front);
//
//		// print the updated queue
//		System.out.println("Queue after removal: " + queue);
//
//		// add another element to the queue
//		queue.add("date");
//
//		// peek at the element at the front of the queue
//		String peeked = queue.peek();
//		System.out.println("Peeked element: " + peeked);
//
//		// print the updated queue
//		System.out.println("Queue after peek: " + queue);
//	}
//}
//
//       output
//    Object queue[2, apple, 3]
//   Queue: [apple, banana, cherry]
//  Removed element: apple
//   Queue after removal: [banana, cherry]
//  Peeked element: banana
// Queue after peek: [banana, cherry, date]
    
    
    
        
public static void main(String [] args){
    
   




   



    
}
}