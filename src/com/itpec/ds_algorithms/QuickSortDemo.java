package com.itpec.ds_algorithms;

public class QuickSortDemo {

	public static void main(String[] args) {
		int[] data= {2,3,2,5,3,8,7,1};
		int min=0;
		int max=data.length;
		QuickSort(data,min,max);
		for(int i:data) {
			System.out.println(i+" ");
		}

	}
public static void QuickSort(int[] A,int min,int max) {
	 int pivot=0,j=0,k=0,l=0;
	FindPivot(A,min,max,j);
	if(j>-1) {
		pivot=A[j];
		Arrange(A,min,max,pivot,k);
		l=k-1;
		QuickSort(A, min, l);
		QuickSort(A, k, max);
	}
}
private static void Arrange(int[] A, int min, int max, int pivot, int ret) {
	int l,r,temp;
	l=min;
	r=max;
	while(l<=r) {
		temp=A[l];
		A[l]=A[r];
		A[r]=temp;
		if(A[l]<pivot) {
			l++;
		}
	    if(A[r]>=pivot) {
	    	r++;
	    }
	}
	ret=l;
	
}
private static void FindPivot(int[] A, int min, int max, int Ret) {
	int pivot,k;
	boolean found;
	pivot=A[min];
	k=min+1;
	Ret=-1;
	found=false;
	while(k<=max && !found) {
		if(A[k]==pivot) {
			k++;
			found=true;
		}
		if(A[k]>pivot) {
			Ret=k;
			Ret=min;
		}
	}
	
}
}
