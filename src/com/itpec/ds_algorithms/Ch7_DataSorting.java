package com.itpec.ds_algorithms;
import java.util.Arrays;

public class Ch7_DataSorting {
public static void main(String[] args) {
	int[] data= {6,65,3,6,2,90,6,52,4242,724,8448,28025,922,58048,382793,83499,8428,546};
	System.out.println("before the sorting.");
	for(int var:data) {
		System.out.print(var+" ");
	}
	
	Arrays.sort(data);
	
	System.out.println("after the sorting.");
	for(int var:data) {
		System.out.print(var+" ");
	}
	System.out.println();
	String[] msg= {"Min chit kaung","Zaw Zaw ","Aye Min Thu","Su Pone Chit"};
	Arrays.sort(msg);
	for(String s:msg) {
		System.out.print(s+",");
	}
}
}
