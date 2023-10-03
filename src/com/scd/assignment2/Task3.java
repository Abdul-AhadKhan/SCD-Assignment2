/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scd.assignment2;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Abdul Ahad
 */
public class Task3 {
    public static void main(String[] args){
        List<int[]> intervals = new ArrayList<>();
        int[] interval = new int[2];
        interval[0] = 1;
        interval[1] = 3;
        intervals.add(interval);

        
        int[] interval2 = new int[2];
        interval2[0] = 2;
        interval2[1] = 4;
        intervals.add(interval2);

        int[] interval3 = new int[2];
        interval3[0] = 2;
        interval3[1] = 6;
        intervals.add(interval3);
        
        int[] interval4 = new int[2];
        interval4[0] = 15;
        interval4[1] = 18;
        intervals.add(interval4);
        System.out.println("Given Intervals :-");
        for (int i = 0; i < intervals.size();i++)
            System.out.println("[ " + intervals.get(i)[0] + ", " + intervals.get(i)[1] + " ]");
        
        mergeIntervals(intervals);
        System.out.println("After Merging Intervals :-");
        for (int i = 0; i < intervals.size();i++)
            System.out.println("[ " + intervals.get(i)[0] + ", " + intervals.get(i)[1] + " ]");

    }
    
    public static void mergeIntervals(List<int[]> intervals){
        
        for (int i = 0; i < intervals.size() - 1;){
            
            if ((intervals.get(i)[1] >= intervals.get(i + 1)[0]) && (intervals.get(i)[1] <= intervals.get(i + 1)[1])){
                intervals.get(i)[1] = intervals.get(i + 1)[1];
                intervals.remove(i + 1);
            }
            else if ((intervals.get(i)[1] >= intervals.get(i + 1)[0]) && (intervals.get(i)[1] >= intervals.get(i + 1)[1])){
                intervals.remove(i + 1);
            }
            else{
                i++;
            }
        }
        
        int lastIndex = intervals.size() - 1;
        int secondlastIndex = intervals.size() - 2;
        
        if ((intervals.get(secondlastIndex)[1] >= intervals.get(lastIndex)[0]) && (intervals.get(secondlastIndex)[1] <= intervals.get(lastIndex)[1])){
            intervals.get(secondlastIndex)[1] = intervals.get(lastIndex)[1];
            intervals.remove(lastIndex);
        }
        else if ((intervals.get(secondlastIndex)[1] >= intervals.get(lastIndex)[0]) && (intervals.get(secondlastIndex)[1] >= intervals.get(lastIndex)[1])){
            intervals.remove(lastIndex);
        }
    }
}
