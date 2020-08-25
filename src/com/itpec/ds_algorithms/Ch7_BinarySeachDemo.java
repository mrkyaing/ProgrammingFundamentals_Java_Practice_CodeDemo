package com.itpec.ds_algorithms;
import java.util.Scanner;

public class Ch7_BinarySeachDemo {

	public static void main(String[] args) {
		int[] data= {9,6,99,9,26672362,908,68,9,10,12,13,15,16268,30};
		int n=data.length;	
		SelectionSort(data);
		for(int var:data) {
			System.out.print(var+" ");
		}
		System.out.println("\n============");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter search key:");
		int x=sc.nextInt();
		int result=BinarySearch(data,x);
		if(result!=-1) {
			System.out.println("found "+result);
		}else {
			System.out.println("not found ");
		}
	}

	private static int BinarySearch(int[] data, int x) {
		int l=0;
		int h=data.length-1;		
		int M=0;
		while(l<=h) {
			M=(l+h)/2;
			if(data[M]==x) {
				return M;		
			}
			if(data[M]>x) {
				h=M-1;//move the h value to  the left By M-1
			}else {
				l=M+1;//move the l value to right By M+1
			}
			
		}		
		return -1;
	}//end of binarySearch 	
	
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
	}//end of selection sort

}
