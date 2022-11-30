import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String S;
		S = sc.nextLine();
		
        StringBuffer sb = new StringBuffer(S);
        String reverse = sb.reverse().toString();
 
        System.out.println(reverse); 
	
        sc.close();
    }
}