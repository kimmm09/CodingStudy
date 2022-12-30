import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, k;
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			k = sc.nextInt();
			for(int j=0; j<k; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
		
		sc.close();
	}
}