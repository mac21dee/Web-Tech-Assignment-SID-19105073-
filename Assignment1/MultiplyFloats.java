import java.util.Scanner;
public class MultiplyFloats {
    public static void main(String[] args) {
        float num1 , num2 ,mul;
        Scanner obj = new Scanner(System.in);
        num1 = obj.nextFloat();
        num2 = obj.nextFloat();
    
        //calculating the sum of num1 and num2 and
        //storing the result in the variable sum
        mul = num1* num2;
    
        //printing the result
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + mul);
        obj.close();
      }
}
