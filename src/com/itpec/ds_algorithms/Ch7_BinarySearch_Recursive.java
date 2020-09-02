package com.itpec.ds_algorithms;
import java.util.Arrays;
public class Ch7_BinarySearch_Recursive {
	public static void main(String[] args) {
		int[] data= {1,6,8,21,74,62,52,8,3,2,9,10};
		Arrays.sort(data);//use java's built-in sorting method
		int c=0;
		for(int i:data) {
			if(c!=data.length-1) {
				System.out.print(i+",");
			}else {
				System.out.print(i);
			}
			c++;		
		}//end of foreach loop
		System.out.println();
		int x=-2;//user's search key .
		int l=0;
		int h=data.length;
		int found=BinarySearch(x,data,l,h);//searching the x value in the sorted data list 
        if(found==-1) {
        	System.out.println(x+" is not found in data list");
        }else {
        	System.out.println(x+" is  found in data list at "+found);
        }
	}//end of main method 
	private static int BinarySearch(int x, int[] data, int l, int h) {	
		if(l>h) {
			return -1;
		}else {
			int m=(l+h)/2;			
			if(x==data[m]) {
				return m;
			}else if(x<data[m]) {
				return BinarySearch(x,data,l,m-1);
			}else if(x>data[m]) {
				return BinarySearch(x,data,m+1,h);
			}	
			return m;
		}		
	}

}
