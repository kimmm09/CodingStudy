import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		

		if(y>=x) {
			System.out.println(Math.abs(y-x));
		}else if(y<x){
			System.out.println(x+y);
		}
		
		sc.close();
	}
}