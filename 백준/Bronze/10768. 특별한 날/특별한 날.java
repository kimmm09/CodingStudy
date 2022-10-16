import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M, D;
		M = sc.nextInt();
		D = sc.nextInt();
		
		if(M==2 && D==18) {
			System.out.println("Special");
		}else if (M<=1 || (M==2 && D<=17)) {
			System.out.println("Before");
		}else if (M>=3 || (M==2 && D>=19)) {
			System.out.println("After");
		}

	}
}