import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		double q, y;
		N = sc.nextInt();

		double sum = 0;
		for(int i=0; i<N; i++) {
			q = sc.nextDouble();
			y = sc.nextDouble();
			
			sum += q*y;
		}
		
		System.out.printf("%.3f",sum);
		
		sc.close();
	}
}