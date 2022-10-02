import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger A, B, C;
		A = sc.nextBigInteger();
		B = sc.nextBigInteger();
		C = sc.nextBigInteger();
		
		System.out.println((A.add(B)).add(C));

		
		sc.close();
	}	
}