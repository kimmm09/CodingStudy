import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T, A, B;
		T = sc.nextInt();
		for(int i=1; i<=T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			int sum = A+B;
			
			System.out.println("Case #" + i + ": " + sum);
		}
		sc.close();
	}	
}