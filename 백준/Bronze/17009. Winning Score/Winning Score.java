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
		F = sc.nextInt();
		
		if(A*3+B*2+C*1 > D*3+E*2+F*1) {
			System.out.println("A");
		}else if(A*3+B*2+C*1 < D*3+E*2+F*1) {
			System.out.println("B");
		}else {
			System.out.println("T");
		}
		
		sc.close();
	}
}