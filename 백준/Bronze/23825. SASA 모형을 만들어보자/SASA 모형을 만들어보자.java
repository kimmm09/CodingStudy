import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, M;
		N = sc.nextInt();
		M = sc.nextInt();
		
		if(N>M) {
			System.out.println(M/2);
		}else if(N==M) {
			System.out.println(N/2);
		}else if(N<M){
			System.out.println(N/2);
		}
		
		
		sc.close();
	}
}