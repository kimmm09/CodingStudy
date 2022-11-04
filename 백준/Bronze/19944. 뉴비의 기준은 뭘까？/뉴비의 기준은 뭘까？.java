import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, M;
		N = sc.nextInt();
		M = sc.nextInt();
		
		if(M==1 || M==2) {
			System.out.println("NEWBIE!");
		}else if(M<=N) {
			System.out.println("OLDBIE!");
		}else{
			System.out.println("TLE!");
		}
		
		sc.close();
	}
}