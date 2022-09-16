import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B, C, D, E, F;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		E = sc.nextInt();

		F = (A*A + B*B + C*C + D*D + E*E)%10;
		System.out.println(F);
			
		sc.close();
	}	
}