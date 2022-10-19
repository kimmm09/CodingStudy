import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, E;
		A = sc.nextInt();
		E = sc.nextInt();
		
		
		if(3<=A && E<=4) {
			System.out.println("TroyMartian");
		}
		if(6>=A && E>=2) {
			System.out.println("VladSaturnian");	
		}
		if(A<=2 && E<=3) {
			System.out.println("GraemeMercurian");	
		}
		else{
		}
		
		sc.close();
	}
}