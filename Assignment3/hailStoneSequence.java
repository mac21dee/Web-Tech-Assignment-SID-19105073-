import java.util.Scanner;
public class hailStoneSequence {
    public static void main(String[] args){
        // Taking number input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        // Running while loop while the number is greater than 1
        while(n!=1){
          if(n%2==0){
            n /=2; // if num is even divide by 2
          }
          else{
            n = n*3 +1; // if num is odd , multiply by 3 and add 1
          }
          System.out.println(n);
        }
        sc.close();
    }
}
