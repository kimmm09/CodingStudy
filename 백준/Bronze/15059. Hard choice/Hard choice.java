import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int C, C1, C2, B, B1, B2, P, P1, P2;
		C1 = sc.nextInt();
		B1 = sc.nextInt();
		P1 = sc.nextInt();
		C2 = sc.nextInt();
		B2 = sc.nextInt();
		P2 = sc.nextInt();
		
		if(C1-C2<0) {
			C = C2-C1;
		}else {
			C = 0;
		}
		if(B1-B2<0) {
			B = B2-B1;
		}else {
			B = 0;
		}
		if(P1-P2<0) {
			P = P2-P1;
		}else {
			P = 0;
		}
		
		System.out.println(C+B+P);
		
		sc.close();
	}
}