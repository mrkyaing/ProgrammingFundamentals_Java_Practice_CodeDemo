package com.itpec.ds_algorithms;
import java.util.Arrays;
public class Ch7_QuickSortDemo {
	public static void main(String[] args) {
        int[] data = {4, 5, 1, 2, 3, 3};
        quickSort(data, 0, data.length-1);
        System.out.println(Arrays.toString(data));
    }
    public static void quickSort(int[] data, int start, int end){
        int partition = partition(data, start, end);
        if(partition-1>start) {
            quickSort(data, start, partition - 1);//sort left side 
        }
        if(partition+1<end) {
            quickSort(data, partition + 1, end);//sort right side
        }
    }
    public static int partition(int[] data, int start, int end){
        int pivot = data[end];
        for(int i=start; i<end; i++){
            if(data[i]<pivot){
                int temp= data[start];
                data[start]=data[i];
                data[i]=temp;
                start++;
            }//end of if
        }//end of for
        int temp = data[start];
        data[start] = pivot;
        data[end] = temp;
        return start;
    }

}
