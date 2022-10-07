import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Date D = new Date();
		SimpleDateFormat SD = new SimpleDateFormat("yyyy-MM-dd");
	
		String sSD = SD.format(D);
		
		System.out.println(sSD);
	}	
}