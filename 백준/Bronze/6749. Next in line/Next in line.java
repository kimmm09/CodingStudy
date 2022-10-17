import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Y, M, O;
		Y = sc.nextInt();
		M = sc.nextInt();

		O = M + (M-Y);
		System.out.println(O);
		
		sc.close();
	}
}
