package com.itpec.ds_algorithms;
import java.util.*;
public class QueueTest {
	public static void main(String[] args) {
		 Queue<Integer> q= new LinkedList<>(); 
         q.add(1);//enqueue
         q.add(2);
         q.add(3);      
         System.out.println(q.poll());//1
         System.out.println(q.peek());//2
         System.out.println(q);//2,3
         Queue<String> q1= new LinkedList<>();
         q1.add("hi");
         q1.add("hello");
         System.out.println(q1);//[hi,Hello]
         for(String s:q1) {
        	 System.out.print(s+" ");
         }
	}
}
