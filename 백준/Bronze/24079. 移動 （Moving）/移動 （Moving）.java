import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X, Y, Z;
		X = sc.nextInt();
		Y = sc.nextInt();
		Z = sc.nextInt();
		
		
		if(X+Y<=Z+0.5) {
			System.out.println(1);
		}else if(X+Y>Z+0.5) {
			System.out.println(0);
		}
			
		
		sc.close();
	}
}
