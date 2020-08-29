package com.itpec.ds_algorithms;

public class Ch7_HeapSortDemo {
	
	public static void buildHeap(int []arr) {
	      
	    /*
	     * As last non leaf node will be at (arr.length-1)/2 
	     * so we will start from this location for heapifying the elements
	     * */
	    for(int i=(arr.length-1)/2; i>=0; i--){
	           heapify(arr,i,arr.length-1);
	      }
	   }//end of buildHeap
	 
	   public static void heapify(int[] arr, int i,int size) { 
	      int left = 2*i+1;
	      int right = 2*i+2;
	      int max;
	      if(left <= size && arr[left] > arr[i]){
	         max=left;
	      } else {
	         max=i;
	      }
	 
	      if(right <= size && arr[right] > arr[max]) {
	         max=right;
	      }
	      // If max is not current node, exchange it with max of left and right child
	      if(max!=i) {
	         exchange(arr,i, max);
	         heapify(arr, max,size);
	      }
	   }
	 
	   public static void exchange(int[] arr,int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp; 
	   }
	 
	   public static int[] heapSort(int[] arr) {    
		   buildHeap(arr);
	      int sizeOfHeap=arr.length-1;
	      for(int i=sizeOfHeap; i>0; i--) {
	         exchange(arr,0, i);
	         sizeOfHeap--;
	         heapify(arr, 0,sizeOfHeap);
	      }
	      return arr;
	   }
	public static void main(String[] args) {
		int data[]= {77,6,4,0,4,2,6,4,2,84,1,-8,66};
		System.out.println("before soring");
		for(int i:data) {
			System.out.print(i+" ");
		}
		heapSort(data);
		System.out.println("\nafter soring");
		for(int i:data) {
			System.out.print(i+" ");
		}
	}

}
