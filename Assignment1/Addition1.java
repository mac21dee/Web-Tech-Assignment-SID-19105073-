import java.util.Scanner;
public class Addition1 {
    public static void main(String[] args) {
      int num1 , num2 ,sum;
      Scanner obj = new Scanner(System.in);
      num1 = obj.nextInt();
      num2 = obj.nextInt();
  
      //calculating the sum of num1 and num2 and
      //storing the result in the variable sum
      sum = num1 + num2;
  
      //printing the result
      System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
      obj.close();
    }
  }