/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scd.assignment2;

/**
 *
 * @author Abdul Ahad
 */
public class FirstNonRepeatingStream {
    Node<Character>[] nodes;
    int[] letters;
    Node<Character> head = null;
    Node<Character> tail;
    String stream;
    
    FirstNonRepeatingStream(){
        nodes = new Node[26];
        letters = new int[26];
        for (int i = 0; i < 26; i++)
            letters[i] = 0;
        head = null;
        tail = null;
        stream = "";
    }
    
    void add(char data){
        
        if (data >= 'A' && data <= 'Z'){
            data += 32;
        }
        
        int index = (int)(data - 97);
        letters[index] += 1;
        System.out.println(letters[index]);
        
        if (letters[index] == 1){
            Node<Character> temp = new Node<>();
            temp.data = data;
            temp.next = null;
            if (head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                temp.prev = tail;
                tail = tail.next;
                
            }
            nodes[index] = temp;
        }
        else if (letters[index] > 1){
            Node<Character> tempPrev = nodes[index].prev;
            Node<Character> tempNext = nodes[index].next;
            Node<Character> current = nodes[index];
            tempPrev.next = tempNext;
            tempNext.prev = tempPrev;
            System.out.println(tempPrev.next + " " + tempNext.prev);
            System.out.println(tempPrev + " " + tempNext);
        }
    }
    
    char getFirstNonRepeating(){
        return head.data;
    }
    
    void print(){
        Node<Character> temp = head;
        while (temp != null){
            System.out.println(temp.data);
            System.out.println(temp.prev + " " + temp.next + " " + temp);
            temp = temp.next;
        }
    }
}
