import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D,E,F,G,H,S,T;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
        D = sc.nextInt();
		E = sc.nextInt();
        F = sc.nextInt();
		G = sc.nextInt();
		H = sc.nextInt();
		
		S = (A+B+C+D);
		T = (E+F+G+H);
		if(S>T) {
			System.out.println(S);
		}else if(S<T) {
			System.out.println(T);
		}else if(S==T){
            System.out.println(S);
        }
		
		sc.close();
	}
}
