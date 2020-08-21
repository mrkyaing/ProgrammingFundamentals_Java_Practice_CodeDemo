import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String :");
		String value=sc.nextLine();
	}
	public static int VowelCount(String inputvalue) {
		int count=0;
		
		char[] myarray=inputvalue.toCharArray();
		for(char c:myarray) {
			switch(c) {
			case 'a':count++;
			
			}
		}
		return 0;
	}

}
