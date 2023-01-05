import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int T;
      int[] arr = new int[5];
      T = sc.nextInt();
      
      int cnt = 0;
      for(int i=0; i<arr.length; i++) {
    	  arr[i] = sc.nextInt();
    	  if (arr[i] == T) {
    		  cnt += 1;
    	  }
      }System.out.println(cnt);
      
      sc.close();
      
   }
}