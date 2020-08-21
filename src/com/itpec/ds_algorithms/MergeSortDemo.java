package com.itpec.ds_algorithms;

public class MergeSortDemo {

	public static void main(String[] args) {
		int arr[] = {32, 45, 67, 2, 7};
	    int len =arr.length;
	 
	    System.out.println("Given array:");
	    printArray(arr, len);
	    
	    // calling merge sort
	    mergeSort(arr, 0, len - 1);
	 
	    System.out.println("\nSorted array:");
	    printArray(arr, len);

	}
	// merge sort function
	static void mergeSort(int a[], int p, int r)
	{
	    int q;
	    if(p < r)
	    {
	        q = (p + r) / 2;
	        mergeSort(a, p, q);
	        mergeSort(a, q+1, r);
	        merge(a, p, q, r);
	    }
	}
	// function to merge the subarrays
	static void merge(int a[], int p, int q, int r)
	{
	    int b[]=new int[5];   //same size of a[]
	    int i, j, k;
	    k = 0;
	    i = p;
	    j = q + 1;
	    while(i <= q && j <= r)
	    {
	        if(a[i] < a[j])
	        {
	            b[k++] = a[i++];    // same as b[k]=a[i]; k++; i++;
	        }
	        else
	        {
	            b[k++] = a[j++];
	        }
	    }
	  
	    while(i <= q)
	    {
	        b[k++] = a[i++];
	    }
	  
	    while(j <= r)
	    {
	        b[k++] = a[j++];
	    }
	  
	    for(i=r; i >= p; i--)
	    {
	        a[i] = b[--k];  // copying back the sorted list to a[]
	    } 
	}
	// function to print the array
  static void printArray(int a[], int size)
	{
	    int i;
	    for (i=0; i < size; i++)
	    {
	        System.out.print(a[i]+" ");
	    }
	}
	 
}
