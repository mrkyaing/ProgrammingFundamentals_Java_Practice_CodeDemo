package com.itpec.ds_algorithms;
public class Ch7_BubbleSort {
public static void main(String[] args) {
int[] s= {28,84,73,16,51};
System.out.println("before sorting.");
for(int var:s) {
	System.out.print(var+" ");
}
BubbleSort(s);
System.out.println("\nafter sorting.");
for(int var:s) {
	System.out.print(var+" ");
}
}

private static void BubbleSort(int[] s) {
	int n=s.length;
	while(n>1) {
		for(int i=0;i<n-1;i++) {
			if(s[i]>s[i+1]) {
				Exchange(s,i, i+1);
			}
		}	
		n--;
	}	
}
private static void Exchange(int[] s,int i, int j) {	
	int temp=s[i];
	s[i]=s[j];
	s[j]=temp;	
}
}
