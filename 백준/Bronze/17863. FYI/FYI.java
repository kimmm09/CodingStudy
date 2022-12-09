import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		N = sc.nextInt();
		
		String num = Integer.toString(N);
		
		if(num.substring(0, 3).equals("555")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		System.out.println();
		
		sc.close();
	}
}