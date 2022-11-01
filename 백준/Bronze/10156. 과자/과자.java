import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int K, N, M;
		K = sc.nextInt();
		N = sc.nextInt();
		M = sc.nextInt();
		
		if(K*N-M>0) {
			System.out.println(K*N-M);
		}else{
			System.out.println(0);
		}
		
		sc.close();
	}
}