import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger T, X, Y;
		T = sc.nextBigInteger();
		
		for(int i=1; i<=T.intValue(); i++) {
			X = sc.nextBigInteger();
			Y = sc.nextBigInteger();
			
			System.out.println(X.add(Y)); 
		}
		
		sc.close();
	}
}
