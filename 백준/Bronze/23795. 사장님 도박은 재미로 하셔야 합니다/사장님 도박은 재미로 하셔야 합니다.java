import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum = 0;
		
		while(true) {
			n = sc.nextInt();
			sum += n;
			
			if(n == -1) {
				break;
			}
		}
		System.out.println(sum+1);
		
		sc.close();
	}
}