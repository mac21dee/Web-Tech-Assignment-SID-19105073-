import java.util.Scanner;
public class Substraction1 {
    public static void main(String[] args) {
        int num1 , num2 ,diff;
        Scanner obj = new Scanner(System.in);
        num1 = obj.nextInt();
        num2 = obj.nextInt();
    
        //calculating the sum of num1 and num2 and
        //storing the result in the variable sum
        diff = num1 - num2;
    
        //printing the result
        System.out.println("Difference of " + num1 + " and " + num2 + " is: " + diff);
        obj.close();
      }
}
