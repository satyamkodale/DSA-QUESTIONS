/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadsa.DoublyLinkedList;

/**
 *
 * @author Satyam
 */
public class DoublyLinkedListCheck {
    
  public static void main(String [] args)
  {
      DoublyLinkedList dd = new DoublyLinkedList();
      dd.insertAtFirst(50);
      dd.insertAtFirst(40);
      dd.insertAtFirst(30);
      dd.insertAtFirst(20);
      dd.insertAtFirst(10);
      dd.display();
      dd.insertAtLast(99);
      dd.display();
    
      dd.insertAtAfter(50, 60);
      dd.display();
      dd.insertAtAfter(99,100);
      dd.display();
  }
    
    
}
