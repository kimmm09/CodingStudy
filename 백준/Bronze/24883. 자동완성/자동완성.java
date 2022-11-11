import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char A;
		A = sc.next().charAt(0);
		
		if(A=='N' || A=='n') {
			System.out.println("Naver D2");
		}else{
			System.out.println("Naver Whale");
		}
		
		sc.close();
	}
}