import java.util.Random;
import java.util.Scanner;

public class noob {

	public static void main(String[] args) {
		
		 int randomValue = 10;
		 Scanner sc=new Scanner(System.in);
		 int userinputvalue;
		 //start the user's input 
		 System.out.println("Guess game (0 to 20) started!!");
		 System.out.print("Guess my Number:");
		 userinputvalue=sc.nextInt();
		 do {

		 System.out.print("Guess again:");
		 userinputvalue=sc.nextInt();
		 
		 if(userinputvalue==randomValue) {
			 System.out.println("Wow!! you got it right!!");
			 System.out.println("Game End!!");		 
		 }else {
			 System.out.println("No!! you got it wrong!!");
		 }
		 
		 }while(userinputvalue!=randomValue); 

	}

}
