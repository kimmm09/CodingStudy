import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		for(int i=1; i<=N; i++) {
			for(int b=N; b>i; b--) {
				System.out.printf("%s", " ");
			}
			for(int a=0; a<i; a++)  {
				System.out.printf("%s", "*");
			}
			System.out.println();
		} 
		sc.close();
	}	
}