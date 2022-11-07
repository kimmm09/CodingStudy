import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		if((A==8 || A==9) && (B==C) && (D==8 || D==9)) {
			System.out.println("ignore");
		} else {
			System.out.println("answer");
		}

		sc.close();
	}
}