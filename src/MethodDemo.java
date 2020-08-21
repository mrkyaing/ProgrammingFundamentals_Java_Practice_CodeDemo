public class MethodDemo {
	//method definition 
		public static void MyMethod() {
			System.out.println("I am comming from user defined method.");
		}//end of MyMethod 
		//method definition 
		public static void sayHello() {
			System.out.println("Hi,I am Ok!! nice to see you!!!");
		}//end of sayhello()
		
	public static void main(String[] args) {
		System.out.println("Hello,welcome to java method !!");
		MyMethod();//method calling
		sayHello();//method calling 
        System.out.println("Are you OK to use your method?");
	}//end of main method 
}//end of class 
