import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C;
		C = sc.nextInt();
		
		for(int i=0; i<C; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			System.out.println(A+B);
		}
		sc.close();
	}	
}