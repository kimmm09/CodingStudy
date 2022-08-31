import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, e, f;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		f = sc.nextInt();
		
		System.out.printf("%d %d %d %d %d %d", (1-a), (1-b), (2-c), (2-d), (2-e), (8-f));
		
	}

}