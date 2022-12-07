import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		String Si;
		N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			Si = sc.next().toLowerCase();
			System.out.println(Si);
		}
		
		sc.close();
    }
}