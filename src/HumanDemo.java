import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HumanDemo {
	public static void main(String[] args) throws ParseException {
		Human h=new Human();
		h.Name="Nyan Linn Htet Bts";
		h. FatherName="U Ba";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date DOB = dateFormat.parse("1998-12-06 00:00:00");
		h. DateOfBirth=DOB;
		h. FaceBookLink="https://web.facebook.com/nyanlinn.htetbts";
		System.out.println("Name:"+h.Name);
		System.out.println("Fb address:"+h.FaceBookLink);
		h.Eat();
		h.Sleep();
		h.Run();
	}

}
