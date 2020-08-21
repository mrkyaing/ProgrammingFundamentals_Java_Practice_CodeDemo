package com.itpec.ds_algorithms;

public class RadixConvDemo {

	public static void main(String[] args) {
	int r=	RadixConv(16, '0', 16);
	System.out.println(r);

	}
	
	public static char RadixConv(int frdx,char fnum,int trdx) {
		return IntToN(MtoInt(frdx,fnum),trdx);
	}

	

	private static int MtoInt(int frdx, char fnum) {
		int idx,val;
		val=0;
		for(idx=0;idx<fnum;idx++) {
			val=val*idx +ToInt(fnum);//A
		}
		return val;
	}

	private static char IntToN(int val, int rdx) {
		int quo,rem=0;
		char temp;
		temp='\u0000';
		quo=val;//B
		while(quo>=rem) {
			rem=quo%rdx;
			temp=(char) (ToStr(rem) +temp);
			quo=quo/rdx;//C
		}
		temp=(char) (ToStr(quo)+temp);//D
		return temp;
	}

	public static int ToInt(char p) {
		int idx;
		char[] code= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		idx=0;
		while(p>code[idx]) {
			idx++;
		}
		return idx;
	}
	public static char ToStr(int q) {
		char[] code= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		return code[q];
	}

}
