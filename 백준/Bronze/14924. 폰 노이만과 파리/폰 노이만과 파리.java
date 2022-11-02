import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int S, T, D;
		S = sc.nextInt();
		T = sc.nextInt();
		D = sc.nextInt();
		
		System.out.println((D/(S*2))*T);
		
		sc.close();
	}
}