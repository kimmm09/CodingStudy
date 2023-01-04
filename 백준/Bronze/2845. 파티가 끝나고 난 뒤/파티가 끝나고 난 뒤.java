import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int L, P;
      int[] arr = new int[5];
      L = sc.nextInt();
      P = sc.nextInt();
      
      for(int i=0; i<arr.length; i++) {
         arr[i] = sc.nextInt();
         
         System.out.print(arr[i] - L*P + " ");
      }
      sc.close();
      
   }
}