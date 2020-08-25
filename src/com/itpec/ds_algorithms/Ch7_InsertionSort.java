package com.itpec.ds_algorithms;

public class Ch7_InsertionSort {
public static void main(String[] args) {
	int s[]= {6,7,37,35,4,69,2,8,16,3,87,22};
	System.out.println("before the sorting!!!");
	for(int i:s) {
		System.out.print(i+" ");
	}
	insertionSort(s);
	System.out.println("\nafter the sorting!!!");
	for(int i:s) {
		System.out.print(i+" ");
	}
}

private static void insertionSort(int[] s) {
	int n = s.length;
    for (int i = 1; i <n; i++) {
      int key = s[i];
      int j = i - 1;
      // Compare key with each element on the left of it until an element smaller than
      // it is found.    
      // For descending order, change key<array[j] to key>array[j].
      while (j >= 0 && key < s[j]) {
        s[j + 1] = s[j];
        j--;
      }

      // Place key at after the element just smaller than it.
      s[j + 1] = key;
    }
}
}
