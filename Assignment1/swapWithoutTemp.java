import java.util.Scanner;
public class swapWithoutTemp {
    public static void main(String[] args) {
        int num1 , num2 ;
        Scanner obj = new Scanner(System.in);
        num1 = obj.nextInt();
        num2 = obj.nextInt();
        System.out.println("Before Swapping:");
        System.out.println("Num1: " + num1 + " Num2: " + num2);
        
        // store sum in num1
        num1 += num2;
        
        // subtract to get num1 in num2
        num2 = num1 - num2;
        
        // subtract again to obtain num2 and store in num1
        num1 -= num2;
        
        System.out.println("After Swapping:");
        System.out.println("Num1: " + num1 + " Num2: " + num2);
        obj.close();
    }
}
