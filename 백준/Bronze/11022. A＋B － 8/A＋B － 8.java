import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, T;
		T = sc.nextInt();
		for(int i=1; i<=T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			System.out.println("Case #"+i+": "+A+ " + " +B+" = "+(A+B));
		}
		sc.close();
	}	
}