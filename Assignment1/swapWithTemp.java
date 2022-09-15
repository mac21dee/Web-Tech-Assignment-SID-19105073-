import java.util.Scanner;
public class swapWithTemp {
    public static void main(String[] args) {
        int num1 , num2 , temp;
        Scanner obj = new Scanner(System.in);
        num1 = obj.nextInt();
        num2 = obj.nextInt();
        System.out.println("Before Swapping:");
        System.out.println("Num1: " + num1 + " Num2: " + num2);
        
        // store num2 in temp
        temp = num2;
        
        // change num2 to num1
        num2 = num1;
        
        // replace num1 with temp which has num2
        num1 = temp;
        
        System.out.println("After Swapping:");
        System.out.println("Num1: " + num1 + " Num2: " + num2);
        obj.close();
    }
}
