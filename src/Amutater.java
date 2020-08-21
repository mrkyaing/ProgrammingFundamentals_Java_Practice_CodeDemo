import java.util.Scanner;

public class Amutater {

	public static void main(String[] args) {
		int myhiddenValue = 10;
		int count=0;
		 Scanner sc=new Scanner(System.in);
		 int userinputvalue;
		 //start the user's input 
		 System.out.println("Guess game (0 to 20) started!!");
		 System.out.print("Guess my Number:");
		 do {	   
		userinputvalue=sc.nextInt();count++;
		 if((myhiddenValue+2)>userinputvalue && userinputvalue!=myhiddenValue) {
			 System.out.println("No!! you got it wrong.your number is too far to my number");
			 
		 }else {
			 System.out.println("No!! you got it wrong.your number is close far to my number");	
		 }
		 
		 if(userinputvalue>20) {
			 System.out.println("Please Read game info detail,Guess number is between 0 to 20 ");			 
		 }
		 
		 if(userinputvalue==myhiddenValue) {
			 System.out.println("Wow!! you got it right!!"+(count)+"at time.");
			 System.out.println("Game End!!");		 
		 }else {
			 System.out.println("No!! you got it wrong!!");
			 System.out.print("Guess Again:");
		 }
		
		 }while(userinputvalue!=myhiddenValue); 
	}

}
