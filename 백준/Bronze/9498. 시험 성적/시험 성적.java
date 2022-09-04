import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		i = sc.nextInt();
		
		if(90<=i && i<=100) {
			System.out.println("A");
		}else if(80<=i && i<=89){
			System.out.println("B");
		}else if(70<=i && i<=79) {
			System.out.println("C");
		}else if(60<=i && i<=69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

		sc.close();
		
	}
	
}