package com.itpec.ds_algorithms;
public class BubbleSortDemo {
	public static void main(String[] args) {
		int[] data= {1,7,3,6,4,9,1,97,30,-9,-2};
		System.out.println("Before sort!!");
		PrintArrayData(data);//method call to print data in array
		BubbleSort(data,data.length);//method call to sort the data in array 
		System.out.println("\nafter sort!!");
		PrintArrayData(data);//method call to print data in array
	}
	public static void BubbleSort(int[] data,int n) {
		while(n>1) {
			for(int i=0;i<n-1;i++) {
				if(data[i]>data[i+1]) {
					int temp=data[i];
					data[i]=data[i+1];
					data[i+1]=temp;
				}//end of if			
			}//end of for
			n--;
		}//end of while
	}
	private static void PrintArrayData(int[] data) {
		for(int i:data) {
			System.out.print(i+" ");
		}
		
	}
}
