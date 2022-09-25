import java.util.Scanner;
public class Powers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // variable to store number till we have to find powers
        int number;
        number = sc.nextInt();
        System.out.println("n   n^2 n^3 n^4");
        for(int i=1;i<=number;i++){
          int val = i;
          // multiplying value by 4 times at each iteration to get all powers
          for(int j=1;j<=4;j++){
            // printing val
            System.out.print(val);
            System.out.print("   ");
            
            val = val*i;
          }
          System.out.println();
        }
        // closing the scanner to avoid memory leak
        sc.close();
    
    }
}
