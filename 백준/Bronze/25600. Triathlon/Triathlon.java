import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int N, a, d, g;
      N = sc.nextInt();
      
      int sum = 0;
      int max = 0;
      for(int i=0; i<N; i++) {
         a = sc.nextInt();
         d = sc.nextInt();
         g = sc.nextInt();
         
         if(a == d+g) {
            sum = (a*(d+g))*2;
         }else {
            sum = a*(d+g);
         }
         
         max = Math.max(max, sum);
         
      }
      System.out.println(max);
      
   }
}