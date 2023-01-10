import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		while(true) {
			x = sc.nextInt();
			
			if(x == 0) {
				break;
			}
			
			int sum = 0;
			for(int i=0; i<=x; i++) {
				sum += i;
			}
			
			System.out.println(sum);
		}
		
		sc.close();
	}
}