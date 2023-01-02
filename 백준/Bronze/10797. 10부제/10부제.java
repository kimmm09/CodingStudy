import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int N;
      int[] arr = new int[5];
      N = sc.nextInt();
      
      int cnt = 0;
      for(int i=0; i<arr.length; i++) {
         arr[i] = sc.nextInt();
         
         if(N == arr[i]) {
        	 cnt ++;
         }
         
      }
      System.out.println(cnt);
   }
}