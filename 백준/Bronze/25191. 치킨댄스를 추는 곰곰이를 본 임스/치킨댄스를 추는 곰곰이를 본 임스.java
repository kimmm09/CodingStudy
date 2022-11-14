import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, A, B;
		N = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(N > A/2+B) {
			System.out.println(A/2+B);
		}else if(N == A/2 + B) {
			System.out.println(A/2+B);
		}else if(N < A/2 + B) {
			System.out.println(N);
		}
			
		sc.close();
	}
}