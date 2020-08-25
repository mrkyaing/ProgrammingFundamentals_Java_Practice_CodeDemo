package com.itpec.ds_algorithms;
public class Ch7_Q7 {
	public static void main(String[] args) {
		int[] data= {10,20,70,100,200,700,900};
		int x=0;
		int N=data.length;
		int i=0;
		while(i<N) {
			x+=data[i];
			i++;
		}	
		System.out.println("x is "+x);

	}

}
