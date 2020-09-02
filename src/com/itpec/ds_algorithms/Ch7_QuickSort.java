package com.itpec.ds_algorithms;
public class Ch7_QuickSort {
	public static void main(String[] args) {
		int[] data= {6,1,3,2};//4
		System.out.println("before sorting..");
		for(int i:data) {
			System.out.print(i+",");
		}
		int begin=0;//0
		int end=data.length-1;//4-1
		
		QuickSort(data,begin,end);//QuickSort Method calling Here .
		System.out.println("\nafter sorting..");
		for(int i:data) {
			System.out.print(i+",");
		}

	}
   //sorting process with Quick Sort Algorithm 
	private static void QuickSort(int[] data, int begin, int end) {// 0 , 3
		if(begin<end) {//0<3
			int partationIndex=partation(data,begin,end);// data,0,3
			QuickSort(data,begin,partationIndex-1);//sorting left side [data,0,-1]
			QuickSort(data,partationIndex+1,end);//sorting right side			
		}
		
	}
	private static int partation(int[] data, int begin, int end) {// 0 ,3 
		int pivot=data[end];//data[3]=>2
		int i=begin-1;//-1
		for(int j=begin;j<end;j++) {//0 to 3  
			if(data[j]<=pivot) {//6 <=2
			i++;
			//exchange the value
			int temp=data[i];
			data[i]=data[j];
			data[j]=temp;
			}//end of if
		}//end of for 
		int temp=data[i+1];//data[0]=>6 
		data[i+1]=data[end];//data[3]=>2
		data[end]=temp;//2,1,3,6
	   System.out.println(i+1);
		return i+1;//return the pivot index value as i variable i=>0
	}

}
