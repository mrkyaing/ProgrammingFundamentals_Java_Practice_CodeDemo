import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int[] data = { 4, 9, 5, 11, 23, 88, 1 };
		Arrays.sort(data);
		System.out.print("Enter search value (number): ");
		try {
			int key = stdin.nextInt();
			int indexValue = binarySearch(data, key);// method calling
			if (indexValue == -1) {
				System.out.print("Search Key is not found in the list.");
			} else {
				System.out.print("Seach key found at " + indexValue);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error");
		}

	}// end of mains
		// Binary search function/method definition

	public static int binarySearch(int[] data, int Searchkey) {
		int i = 0;
		int j = data.length - 1;
		while (i < j) {
			int m = (i + j) / 2;
			if (Searchkey > data[m]) {
				i = m + 1;
			} else {
				j = m;
			}
		} // end of while loop
		if (Searchkey == data[i]) {
			return i;
		} else {
			return -1;
		} // end of else
	}// end of binarysearch method
}// end of class
