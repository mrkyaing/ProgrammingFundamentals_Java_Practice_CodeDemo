package com.itpec.ds_algorithms;
import java.util.*;
public class LinearSeachDemo {

	public static void main(String[] args) {
		int[] T=new  int[200000];
		
		
		int x=200;
        int result=searchkey(T,x);
        if(result!=-1) {
        	System.out.println("found ");
        }else{
        	System.out.println("not found");
        }		
	}
	
	public static int searchkey(int[] data,int x) {
		for(int i=0;i<data.length;i++) {
			if(data[i]==x) {			
				return i;
			}		
		}
		return -1;
	}

}
