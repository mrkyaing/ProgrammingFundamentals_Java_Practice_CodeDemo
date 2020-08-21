package com.itpec.ds_algorithms;

public class SchedulingNTasks {
	static int N=5;
	static int[][] adj= {{0,0,0,0,0},{1,0,0,1,0},{0,1,0,0,1},{0,0,0,0,0},{0,1,0,1,0}};
	static int front=0,rear=0;
	static int[] indeg=new int[N];
	static int[]  queue_array=new int[N];
	static int[] schedule=new int[N];
	public static void main(String[] args) {	
		Scheduling();
	}
	public static void insert_queue(int vertex) {
		queue_array[rear]=vertex;
		rear++;
	}
	
	public static int remove_queue() {
		int item=0;
		item=queue_array[front];
		front++;
		return item;
	}
	
	public static int indegree(int vertex) {
		int in_deg=0;
		for(int i=0;i<N;i++) {
			if(adj[i][vertex]==1) {
				in_deg++;
			}
		}
		return in_deg;
	}
	
	public static void Scheduling() {
		int  vertex=0,j=0;
		for(int i=0;i<N;i++) {
			indeg[i]=indegree(i);
			if(indeg[i]==0) {
				System.out.println("hi");
				insert_queue(i);
			}//end of if
		}//end of for
		while(front<rear) {
			vertex=remove_queue();
			schedule[j]=vertex;
			j++;
			for(int i=0;i<N;i++) {
				if(adj[vertex][i]==1) {
					System.out.println("hello");
					adj[vertex][i]=0;
					indeg[i]=indeg[i]-1;
					if(indeg[i]==0) {
						insert_queue(i);
					}
				}
			}
		}//end of while
		System.out.print("The Order of task is ");
		for(int i=0;i<N;i++) {
			System.out.print(" "+schedule[i]);
		}
	}

}
