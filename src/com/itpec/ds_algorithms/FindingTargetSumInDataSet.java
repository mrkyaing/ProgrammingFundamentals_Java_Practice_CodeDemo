package com.itpec.ds_algorithms;

public class FindingTargetSumInDataSet {
static int n=8,s=14;
static int[] A= {6,3,2,5,1,1,7,3};

public static void SSumnaive() {
	int sum,start,end,found=0;
	for(start=0;start<n;start++) {
		sum=0;
		for(end=start;sum<s && end<n;end++) {
			System.out.println("X");
			sum=(sum+A[end]);
			if(s==sum) {
				System.out.print(start+" "+end);
				found=1;
			}
		}
	}
	if(found==0) {
		System.out.println("No sub array found");
	}
}
public static void SSum2Point() {
	int sum=A[0];
	int start=1,end=0,found=0;
	for(end=0;end<n;end++) {
		while(s<sum && start<end) {
			sum=(sum-A[start]);
			start++;
		}
		if(s==sum) {
			System.out.println(start+", "+end);
		}
		if(end<n) {
			sum=(sum+A[end]);
		}
	}
	if(found==0) {
		System.out.println("No sub array found");
	}
}
	public static void main(String[] args) {
		SSumnaive() ;
		System.out.println();
		System.out.println("==");
		SSum2Point();
	}

}
