import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, h, v;
		n = sc.nextInt();
		h = sc.nextInt();
		v = sc.nextInt();
		
		int vol = 0;
		if(n-h>h) {
			if(n-v>v) {
				vol = (n-h)*(n-v)*4;
				System.out.println(vol);
			}else {
				vol = (n-h)*v*4;
				System.out.println(vol);
			}
		}else {
			if(n-v>v) {
				vol = h*(n-v)*4;
				System.out.println(vol);
			}else {
				vol = h*v*4;
				System.out.println(vol);
			}
		}
		
		sc.close();
	}
}