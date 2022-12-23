import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		String J, M;
		J = sc.nextLine();
		N = sc.nextInt();
		
		int cnt = 0;
		for(int i=0; i<=N; i++) {
			M = sc.nextLine();
			if(J.equals(M)) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
		
		sc.close();
	}
}