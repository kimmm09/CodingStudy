import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, I;
		A = sc.nextInt();
		I = sc.nextInt();

		System.out.println(A*(I-1)+1);
		
		sc.close();
	}
}