import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int B, P;
		B = sc.nextInt();
		
		P = 5*B-400;
		if(P<100) {
			System.out.println(P);
			System.out.println("1");
		}else if(P==100){
			System.out.println(P);
			System.out.println("0");
		}else {
			System.out.println(P);
			System.out.println("-1");
		}

		sc.close();
	}
}