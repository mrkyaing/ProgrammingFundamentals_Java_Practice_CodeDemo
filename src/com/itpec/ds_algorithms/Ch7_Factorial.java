package com.itpec.ds_algorithms;

public class Ch7_Factorial {

	public static void main(String[] args) {
		int n=6;
		int result=Factorial(n);
		System.out.println("Factorial of "+n+" is "+result);
		int result1=Fact(n);
		System.out.println("Factorial of "+n+" is "+result1);
		int result2=Fac(n);
		System.out.println("Factorial of "+n+" is "+result2);

	}

	private static int  Factorial(int n) {
		if(n==1) {
			return 1;
		}else {
			return Factorial(n-1)*n;
		}
		
		/*if(n>1) {
			return Factorial(n-1)*n;
		}else {
			return 1;
		}*/
		
	}
	
		public static int Fact(int n) {//n=6
			int x,m;
			m=1;
			for(x=1;x<=n;x++) {
				m=m*x;
			}
			return m;
		}
		
		public static int Fac(int n) {//n=6
			int m=1;
			while(n>0) {
				m=m*n;
				n--;
			}
			return m;
		}
}
