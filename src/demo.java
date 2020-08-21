
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Shape s1=new Circle();
     Draw(s1);
     Shape s2=new Triagle();
     Draw(s2);
	}
	
	public static void Draw(Shape s) {
		s.draw();
	}

}
