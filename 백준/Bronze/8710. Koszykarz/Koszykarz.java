import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k, w, m, a;
		k = sc.nextInt();
		w = sc.nextInt();
		m = sc.nextInt();
		
		a = (w-k)%m;
		if(a==0) {
			System.out.println((w-k)/m);
		} else {
			System.out.println((w-k)/m+1);
		}
		
		sc.close();
	}
}