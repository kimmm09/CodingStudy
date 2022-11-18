import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger N, M;
		N = sc.nextBigInteger();
		M = sc.nextBigInteger();
		
		if(N.compareTo(M)==0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	
		sc.close();
	}
}