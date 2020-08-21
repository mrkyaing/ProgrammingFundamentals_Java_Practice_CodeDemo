package com.itpec.ds_algorithms;
public class SelectionSortingDemo {
	public static void main(String[] args) {
		int[] data= {2,4,2,47,3,-1,3,6,53,-4};
        SelectionSort(data);//method calling 
        for(int i:data) {
        	System.out.print(i+" ");
        }
        
	}//end of main method	
	public static void SelectionSort(int data[]) {
		int n=data.length;
		for(int i=0;i<(n-1);i++) {
			for(int j=(i+1);j<n;j++) {
				if(data[i]>data[j]) {
					Exchangedata(data,i,j);
				}//end of if
			}//end of j loop
		}//end of i loop
	}//end of SelectionSort method
	
	private static void Exchangedata(int[] data, int i, int j) {
		int temp=data[i];
		data[i]=data[j];
		data[j]=temp;	
	}
}//end of class 
