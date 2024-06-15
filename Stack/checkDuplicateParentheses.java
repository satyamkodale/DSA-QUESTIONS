
package com.javadsa.Stack;


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
public class checkDuplicateParentheses {
    
public static boolean checkDuplicateParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ')') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.peek() == '(') {
                    return true; // Unmatched closing parenthesis or no opening parenthesis
                } else {
                    // Pop characters until matching opening parenthesis is found
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        stack.pop();
                    }
                    // Pop the opening parenthesis
                    stack.pop();
                }
            }
        }

        // If stack is not empty, there are unmatched opening parentheses
        return !stack.isEmpty();
    }
}
