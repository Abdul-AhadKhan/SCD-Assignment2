/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scd.assignment2;

import java.util.EmptyStackException;
/**
 *
 * @author Abdul Ahad
 */
public class Task1 {
    public static void main(String[] args){
        try{
            GenericStack<Integer> stack = new GenericStack<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            System.out.println("Integer Stack :-");
            System.out.println("Size: " + stack.size());
            stack.print();
            System.out.println("Stack After Popping Element");
            stack.pop();
            System.out.println("Size: " + stack.size());
            stack.print();
            System.out.println("Stack After Popping Element");
            stack.pop();
            System.out.println("Size: " + stack.size());
            stack.print();
            System.out.println("Stack After Popping Element");
            stack.pop();
            System.out.println("Size: " + stack.size());
//            stack.print();
//            stack.pop();
//            System.out.println("Stack After Popping Element");
            
            
            GenericStack<String> stack2 = new GenericStack<>();
            stack2.push("One");
            stack2.push("Two");
            stack2.push("Three");
            System.out.println("String Stack :-");
            System.out.println("Size: " + stack2.size());
            stack2.print();
            System.out.println("Stack After Popping Element");
            stack2.pop();
            System.out.println("Size: " + stack2.size());
            stack2.print();
            
            GenericStack<Float> floatStack = new GenericStack<>();
            floatStack.push((float)1.1);
            floatStack.push((float)9.2);
            floatStack.push((float)10.99);
            floatStack.push((float)22.3);
            System.out.println("Float Stack :-");
            System.out.println("Size: " + floatStack.size());
            floatStack.print();
            System.out.println("Stack After Popping Element");
            floatStack.pop();
            System.out.println("Size: " + floatStack.size());
            floatStack.print();
            System.out.println("Stack After Popping Element");
            floatStack.pop();
            System.out.println("Size: " + floatStack.size());
            floatStack.print();
            System.out.println("Stack After Popping Element");
            floatStack.pop();
            System.out.println("Size: " + floatStack.size());
            floatStack.print();
            System.out.println("Stack After Popping Element");
            floatStack.pop();
            System.out.println("Size: " + floatStack.size());
            floatStack.print();
            System.out.println("Stack After Popping Element");
            floatStack.pop();
            System.out.println("Size: " + floatStack.size());
            floatStack.print();
            
        }
        catch (EmptyStackException e){
            System.out.println("Error: Stack is Empty");
        }
        catch (IllegalArgumentException e){
            System.out.println("Error: Incorrect data");
        }
    }
}
