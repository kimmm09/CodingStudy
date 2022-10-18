import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, F;
		A = sc.nextInt();
		B = sc.nextInt();
		
		F = B - A;
		if(1<=F && F<=20) {
			System.out.println("You are speeding and your fine is $100.");
		}else if(21<=F && F<=30) {
			System.out.println("You are speeding and your fine is $270.");	
		}else if(31<=F) {
			System.out.println("You are speeding and your fine is $500.");	
		}else if(F<=0) {
			System.out.println("Congratulations, you are within the speed limit!");
		}
		
		sc.close();
	}
}