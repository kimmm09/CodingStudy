import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H, M, T;
		H = sc.nextInt();
		M = sc.nextInt();
		T = sc.nextInt();
		
		M = H*60 + M;
		M = M + T;
		
		H = (M/60) % 24;
		M = M % 60;
		
		System.out.println(H + " " + M);
		
	}
	
}