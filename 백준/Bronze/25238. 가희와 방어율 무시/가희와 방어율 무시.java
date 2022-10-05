import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b;
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		double c = a-(a*(b/100));
		if(c>=100) {
			System.out.println("0");
		}else{
			System.out.println("1");
		}
        
		sc.close();
	}	
}