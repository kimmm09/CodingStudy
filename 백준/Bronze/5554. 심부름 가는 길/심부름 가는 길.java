import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D,X,Y;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		X = (A+B+C+D)/60;
		Y = (A+B+C+D)%60;
		System.out.println(X);
		System.out.println(Y);
		
		sc.close();
	}
}
