import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String S;
		S = sc.nextLine();
		
		char[] arr;
		arr = S.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			if(65<=arr[i] && arr[i]<=90) {
				arr[i] = (char)(arr[i]+32);
				continue;
			}
			if(97<=arr[i] && arr[i]<=122) {
				arr[i] = (char)(arr[i]-32);
				continue;
			}
			
		}System.out.println(arr);
		
		sc.close();
	}
}