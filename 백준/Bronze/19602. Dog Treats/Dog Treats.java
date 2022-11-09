import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int S, M, L;
		S = sc.nextInt();
		M = sc.nextInt();
		L = sc.nextInt();
		
		if(1*S + 2*M + 3*L >= 10) {
			System.out.println("happy");
		}else {
			System.out.println("sad");
		}

		sc.close();
	}
}