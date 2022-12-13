import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ax, ay, az, cx, cy, cz;
		ax = sc.nextInt();
		ay = sc.nextInt();
		az = sc.nextInt();
		cx = sc.nextInt();
		cy = sc.nextInt();
		cz = sc.nextInt();
		
		int bx, by, bz;
		bx = cx - az;
		by = cy / ay;
		bz = cz - ax;
		
		System.out.printf("%d %d %d" , bx, by, bz);

		sc.close();
	}
}