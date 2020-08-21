
public class MethodDemo2 {
	public static void main(String[] args) {
		int n=10;
		int myresult=getSquare(n);//calling the getSquare method 
        System.out.println("the squre of "+n+" is "+myresult);//100
        System.out.println(myresult+10);//110
	}//end of main method()
	//method definition 
	public static int getSquare(int n) {
		int r=n*n;
		System.out.println(r);//100
		return r;
	}//end of getSquare method()

}//end of class 
