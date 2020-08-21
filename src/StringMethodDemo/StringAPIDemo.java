package StringMethodDemo;

public class StringAPIDemo {
	public static void main(String[] args) {
		String str="Hello,how are you?";	
		System.out.println(str.length());//output 18
        System.out.println(str.charAt(0));//output  H
        System.out.println(str.indexOf('H'));//output 0
        String str2="Hi";
        System.out.println(str.equals(str2));//output false
        System.out.println(str.substring(0, 5));//output Hello
	}

}
