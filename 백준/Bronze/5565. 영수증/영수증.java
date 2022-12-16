import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum, a, b, c, d, e, f, g, h, i;
		sum = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		f = sc.nextInt();
		g = sc.nextInt();
		h = sc.nextInt();
		i = sc.nextInt();
		
		System.out.println(sum - (a+b+c+d+e+f+g+h+i));

		
		sc.close();
	}
}