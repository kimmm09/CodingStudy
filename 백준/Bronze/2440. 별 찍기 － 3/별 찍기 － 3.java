import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A;
		A = sc.nextInt();
		
		for(int i=0; i<A; i++) {
			for(int n=A; n>i; n--) {
				System.out.printf("%s", "*");				
			}
			System.out.println();
		}			
	
		sc.close();
	}	
}