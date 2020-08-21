import java.util.Scanner;
public class MultidimensionalDemo {
	public static void main(String[] args) {
		int[][] m = new int[3][4];
		Scanner stdin=new Scanner(System.in);
		//3rows for outer loop
		for (int i= 0; i < m.length; ++i) {
			//4columns for inner loop
			for (int j = 0; j < m[i].length; ++j){
				System.out.print("Enter a value: "+"("+i+","+j+"):");
				   m[i][j] = stdin.nextInt();
			}//end of j
		}//end of i
		
		for (int i= 0; i < m.length; ++i) {
			for (int j = 0; j < m[i].length; ++j){				
				  System.out.print( m[i][j]+"\t");
				  
			}//end of j
			System.out.println();
		}//end of i
	}//end of main method

}//end of class
