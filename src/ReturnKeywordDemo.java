public class ReturnKeywordDemo {
	public static void main(String[] args) {
		System.out.println(ok());
	}//end of main method
	
	static int ok(){
		int total=0;
		int i=0;
		while(i<10){
		total+=i;//0
		i++;		
		return total;		
		}
		return total;
	}//end of ok method

}//end of class 
