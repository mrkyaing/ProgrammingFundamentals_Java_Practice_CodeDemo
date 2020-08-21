import java.util.Scanner;

public class Master {

	public static void main(String[] args) {
		int myhiddenValue = 10;
		String msg;
		int count=0;
		 Scanner sc=new Scanner(System.in);
		 int userinputvalue;
		 //start the user's input 
		 System.out.println("Guess game (0 to 20) started!!");
		 System.out.print("Guess my Number:");
		do {
		 do {	   
		userinputvalue=sc.nextInt();count++;
		 if((myhiddenValue+2)>userinputvalue && userinputvalue!=myhiddenValue) {
			 System.out.println("No!! you got it wrong.your number is close far to my number");
			 
		 }else if((myhiddenValue+2)<userinputvalue && userinputvalue!=myhiddenValue) {
			 System.out.println("No!! you got it wrong.your number is  far to my number");	
		 }
		 
		 else if(userinputvalue>20) {
			 System.out.println("Please Read game info detail,Guess number is between 0 to 20 ");			 
		 }
		 
		 else if(userinputvalue==myhiddenValue) {
			 System.out.println("Wow!! you got it right!!"+(count)+"at time.");
			 System.out.println("Game End!!");		 
		 }else {
			 System.out.println("No!! you got it wrong!!");
			
		 }
		 System.out.print("Guess Again:");
		 }while(userinputvalue!=myhiddenValue);//end of will do until value != hidden
		 
		 count=0;//resetting the counting value
		 System.out.print("wanna try again(y/n)!");
		 Scanner key=new Scanner(System.in);
		 msg=key.nextLine();
		 
		 if(msg.equals("y")) {
			 System.out.print("Guess Again:"); 
		 }
		 
		 }while(msg.equals("y"));//end to check yes or no
		System.out.print("GAME END .THANKS");
		 
	}

}
