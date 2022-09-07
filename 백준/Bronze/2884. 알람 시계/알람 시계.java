import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H, M;
		H = sc.nextInt();
		M = sc.nextInt();
		
		if(M<45) {
			H = H-1;
			M = 60-(45-M);
			
			if(H<0) {
				H=23;
			} 
			System.out.printf("%d %d", H, M);
			
		} else { 
			M = M-45;
			System.out.printf("%d %d", H, M);
		}
		sc.close();
	}
	
}