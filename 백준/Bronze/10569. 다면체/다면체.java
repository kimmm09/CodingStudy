import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T, V, E;
		T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			V = sc.nextInt();
			E = sc.nextInt();
			System.out.println(Math.abs(V-E-2));
		}

		sc.close();
	}
}