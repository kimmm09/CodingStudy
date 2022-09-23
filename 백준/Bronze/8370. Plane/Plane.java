import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N1, N2, K1, K2;
		N1 = sc.nextInt();
		K1 = sc.nextInt();
		N2 = sc.nextInt();
		K2 = sc.nextInt();
		
		System.out.println(N1*K1 + N2*K2);
		
		sc.close();
	}
}