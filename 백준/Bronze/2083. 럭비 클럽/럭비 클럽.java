import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String N;
		int A, W;
		
		while(true) {
			N = sc.next();
			A = sc.nextInt();
			W = sc.nextInt();
			
			if(N.equals("#") && A==0 && W==0) {
				break;
			}
			
			if(A>17 || W>=80) {
				System.out.println(N + " Senior");
			}else{
				System.out.println(N + " Junior");
			}

		}
		sc.close();
	}	
}