import java.util.Scanner;

public class SearchingArrayDemo {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int[] data= {4,9,5};
		int i;
		System.out.print("Enter search value (number): ");
		    	
		try {
			int key = stdin.nextInt();

		for ( i = 0; i < data.length; ++i) {
			if (key == data[i]) {
				break;
			}
		}
		if(i!=data.length) {
			System.out.println("the key "+key+"is found at "+(i+1)+"-th element");
		}else {
			System.out.println("the key "+key+"is not found.");
		}//end end of else 
		}//end of try
		catch(Exception e) {
			System.out.println("Please Only Enter a Number Value :( try again .");
		}
		
		
}
	}
