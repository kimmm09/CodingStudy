import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int l, w, a;

		while(true) {
			l = sc.nextInt();
			w = sc.nextInt();
			a = sc.nextInt();
			
			if(l==0 && w==0 && a==0) {
				break;
			}else if(l==0) {
				l = a/w;
				System.out.printf("%d %d %d", l,w,a);
			}else if(w==0) {
				w = a/l;
				System.out.printf("%d %d %d", l,w,a);
			}else if(a==0) {
				a = l*w;
				System.out.printf("%d %d %d", l,w,a);
			}
			System.out.println("");
		}

		sc.close();
	}
}