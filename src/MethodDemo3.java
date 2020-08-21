public class MethodDemo3 {
	public static void main(String[] args) {
		int[] data= {1,9,8,5,3,5,1,5,234,25,6,52,52,2285,635,325,256,0};
		int key=6;
		int result=SeachingTheKey(data,key);//method calling with 2 paremters 
		if(result==-1) {
			System.out.println("The key is not found!!!");
		}else {
			System.out.println("The key "+key+" is  found at the inde of "+result+".");
		}		
	}
	//method definition with int array and int key
	public static int SeachingTheKey(int[] data,int key) {
		int found=0;
		for(int i=0;i<data.length;i++) {
			if(data[i]==key) {//checking the key in the array by each item with index
				found=i;
				return found;
			}else{
				found=-1;
			}
		}//end of for
		return found;
	}//end of SeachingTheKey method 
}//end of class 
