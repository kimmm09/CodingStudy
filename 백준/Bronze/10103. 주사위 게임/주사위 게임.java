import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, a, b;
		n = sc.nextInt();
		
		int sum = 0, sum1 = 0;
		for(int i=0; i<n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a>b) {
				sum += a;
			}else if(a<b) {
				sum1 += b;
			}
			
		}
		System.out.println(100-sum1);
		System.out.println(100-sum);
		
		sc.close();
	}
}