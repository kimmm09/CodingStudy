import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger A, B;
		A = sc.nextBigInteger();
		B = sc.nextBigInteger();
		
		System.out.println(A.add(B));
		System.out.println(A.subtract(B));
		System.out.println(A.multiply(B));
		
		sc.close();
	}	
}