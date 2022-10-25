import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		i = sc.nextInt();
		
		for(int n=1; n<=i; n++ ) {
			System.out.println("Hello World, Judge "+n+"!");
		}
		
		sc.close();
	}
}