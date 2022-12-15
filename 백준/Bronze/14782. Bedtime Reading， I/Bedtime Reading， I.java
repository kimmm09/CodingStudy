import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int I;
		I = sc.nextInt();
		
		int j, sum;
		sum = 0;
		for(j=1; j<=I; j++) {
			if(I%j==0) {
				sum += j;
			}
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}