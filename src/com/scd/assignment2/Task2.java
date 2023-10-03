/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scd.assignment2;

/**
 *
 * @author Abdul Ahad
 */
public class Task2 {
    public static void main(String[] args){
        FirstNonRepeatingStream nonrepeatingStream = new FirstNonRepeatingStream();
        nonrepeatingStream.add('a');
        nonrepeatingStream.add('b');
        nonrepeatingStream.add('c');
        nonrepeatingStream.add('b');
        nonrepeatingStream.add('a');
        nonrepeatingStream.add('c');
        nonrepeatingStream.add('z');
        nonrepeatingStream.add('i');
        System.out.println(nonrepeatingStream.getFirstNonRepeating());
        System.out.println("Printing :-");
        nonrepeatingStream.print();
    }
}
