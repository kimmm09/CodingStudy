import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A<2) {
			System.out.println(0);
		}else if((A/2)<=B){
			System.out.println(A/2);
		}else if((A/2)>B)
			System.out.println(B);

		sc.close();
	}

}