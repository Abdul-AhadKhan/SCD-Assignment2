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
        nonrepeatingStream.add('a');
        nonrepeatingStream.add('b');
        nonrepeatingStream.add('i');
        nonrepeatingStream.add('k');
        nonrepeatingStream.add('i');
        nonrepeatingStream.add('k');
        nonrepeatingStream.add('l');
        nonrepeatingStream.add('j');
        
        System.out.print("Stream : ");
        nonrepeatingStream.print();
        System.out.println("");
        System.out.println("First Non Repeating Character: " + nonrepeatingStream.getFirstNonRepeating());
    }
}
