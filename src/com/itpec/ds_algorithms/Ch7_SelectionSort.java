package com.itpec.ds_algorithms;
public class Ch7_SelectionSort {
	public static void main(String[] args) {
	int[] s= {28,84,73,16,51};
	System.out.println("before the soring");
	for(int var:s) {
		System.out.print(var+" ");
	}
	SelectionSort(s);
	System.out.println("\nafter the soring(ascending order)");
	for(int var:s) {
		System.out.print(var+" ");
	}
	System.out.println("\nafter the soring(desending order)");
	for(int i=s.length-1;i>=0;i--) {
		System.out.print(s[i]+" ");
	}
	}
public static void SelectionSort(int[] s) {
	int n=s.length;
	for(int i=0;i<n-1;i++) {
		for(int j=i+1;j<n;j++) {
			if(s[i]>s[j]) {
				//exchange the value 
				int w=s[i];
				s[i]=s[j];
				s[j]=w;
			}
		}
	}
}
}
