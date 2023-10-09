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
        interval2[1] = 6;
        intervals.add(interval2);

        int[] interval3 = new int[2];
        interval3[0] = 8;
        interval3[1] = 10;
        intervals.add(interval3);
        
        int[] interval4 = new int[2];
        interval4[0] = 15;
        interval4[1] = 18;
        intervals.add(interval4);
        System.out.println("Given Intervals :-");
        for (int i = 0; i < intervals.size();i++)
            System.out.println("[ " + intervals.get(i)[0] + ", " + intervals.get(i)[1] + " ]");
        
        System.out.println("After Merging Intervals :-");
        mergeIntervals(intervals);
        intervals.clear();
        
        
        interval[0] = 1;
        interval[1] = 3;
        intervals.add(interval);
        
        interval2[0] = 2;
        interval2[1] = 4;
        intervals.add(interval2);
        
        interval3[0] = 2;
        interval3[1] = 6;
        intervals.add(interval3);
        
        interval4[0] = 15;
        interval4[1] = 18;
        intervals.add(interval4);
        
        System.out.println("Given Intervals :-");
        for (int i = 0; i < intervals.size();i++)
            System.out.println("[ " + intervals.get(i)[0] + ", " + intervals.get(i)[1] + " ]");
        
        System.out.println("After Merging Intervals :-");
        mergeIntervals(intervals);
        intervals.clear();
        
        interval[0] = 1;
        interval[1] = 3;
        intervals.add(interval);
        
        interval2[0] = 2;
        interval2[1] = 4;
        intervals.add(interval2);
        
        interval3[0] = 2;
        interval3[1] = 6;
        intervals.add(interval3);
        
        
        System.out.println("Given Intervals :-");
        for (int i = 0; i < intervals.size();i++)
            System.out.println("[ " + intervals.get(i)[0] + ", " + intervals.get(i)[1] + " ]");
        
        System.out.println("After Merging Intervals :-");
        mergeIntervals(intervals);
        intervals.clear();
        
        interval[0] = 1;
        interval[1] = 3;
        intervals.add(interval);
        
        interval2[0] = 5;
        interval2[1] = 9;
        intervals.add(interval2);
        
        interval3[0] = 12;
        interval3[1] = 6;
        intervals.add(interval3);
        
        interval4[0] = 15;
        interval4[1] = 18;
        intervals.add(interval4);
        
        System.out.println("Given Intervals :-");
        for (int i = 0; i < intervals.size();i++)
            System.out.println("[ " + intervals.get(i)[0] + ", " + intervals.get(i)[1] + " ]");
        
        System.out.println("After Merging Intervals :-");
        mergeIntervals(intervals);
        intervals.clear();
    }
    
    public static void mergeIntervals(List<int[]> intervals){
        
        int[] interval = new int[2];
        boolean remove = false;
        int removalcount = 0;
        for (int i = 0; i < intervals.size() - 1;){
            
            if (!remove){
                interval[0] = intervals.get(i)[0];
                interval[1] = intervals.get(i)[1];
            }
            if ((interval[1] >= intervals.get(i + 1)[0]) && (interval[1] <= intervals.get(i + 1)[1])){
                interval[1] = intervals.get(i + 1)[1];
                remove = true;
                removalcount = removalcount + 1;
                i = i + 1;
            }
            else if ((interval[1] >= intervals.get(i + 1)[0]) && (interval[1] >= intervals.get(i + 1)[1])){
                interval[0] = intervals.get(i)[0];
                interval[1] = intervals.get(i)[1];
                remove = true;
                removalcount = removalcount + 1;
                i = i + 1;
            }
            else{
                if (remove){
                    System.out.println("[ " + interval[0] + ", " + interval[1] + " ]");
                    remove = false;
                    removalcount = 0;
                }
                else{
                    System.out.println("[ " + interval[0] + ", " + interval[1] + " ]");
                }
                i = i + 1;
            }
        }
        
        int lastIndex = intervals.size() - 1;
        if (remove){
            System.out.println("[ " + interval[0] + ", " + interval[1] + " ]");
        }
        else{
            System.out.println("[ " + intervals.get(lastIndex)[0] + ", " + intervals.get(lastIndex)[1] + " ]");
        }
        
    }
}
