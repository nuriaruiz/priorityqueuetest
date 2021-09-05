package com.nuria;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {

    /**
     * EJEMPLO DE ENTRADA:
     * 12
     * ENTER John 3.75 50
     * ENTER Mark 3.8 24
     * ENTER Shafaet 3.7 35
     * SERVED
     * SERVED
     * ENTER Samiha 3.85 36
     * SERVED
     * ENTER Ashley 3.9 42
     * ENTER Maria 3.6 46
     * ENTER Anik 3.95 49
     * ENTER Dan 3.95 50
     * SERVED
     * @param args
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        ComparatorStudents comparatorStudents = new ComparatorStudents();
        PriorityQueue<Student> priorityQueue = new PriorityQueue(50, comparatorStudents);

        while(testCases>0){
            String line = in.nextLine();
            List<String> orders = Arrays.asList(line.split("\\s"));
            if (orders.get(0).equals("ENTER")){
                priorityQueue.add(new Student(Integer.parseInt(orders.get(3)), Double.parseDouble(orders.get(2)), orders.get(1)));
                priorityQueue.stream().forEach(System.out::println);
            }else if (orders.get(0).equals("SERVED")){
                priorityQueue.remove();
                priorityQueue.stream().forEach(System.out::println);
            }
            testCases--;
        }
        priorityQueue.stream().forEach(System.out::println);
    }
}
