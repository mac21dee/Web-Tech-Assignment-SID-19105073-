import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        int num1 , num2;
        int quotient,remainder;
        Scanner obj = new Scanner(System.in);
        num1 = obj.nextInt();
        num2 = obj.nextInt();
    
        //calculating the sum of num1 and num2 and
        //storing the result in the variable sum
        quotient = num1/num2;
        remainder = num1%num2;
    
        //printing the result
        System.out.println("Quotient of " + num1 + " and " + num2 + " is: " + quotient);
        System.out.println("Remainder of " + num1 + " and " + num2 + " is: " + remainder);
        obj.close();
      }
}
