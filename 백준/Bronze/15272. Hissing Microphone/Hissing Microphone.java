import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String A;
		A = sc.nextLine();
		
		if(A.contains("ss")) {
			System.out.println("hiss");
		}else {
			System.out.println("no hiss");
		}

		sc.close();
	}
}