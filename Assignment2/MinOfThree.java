// import java.util.Scanner;
public class MinOfThree {
    public static void main(String[] args) {
        int num1 = 65, num2 = 69, num3 = 34;

        // variable to store the smallest of the three
        int smallest;

        // check smallest from first two values
        // then compare with the third value
        if(num1 < num2) {
            if(num1 < num3) {
                smallest = num1;
            } else {
                smallest = num3;
            }
        } else {
            if(num2 < num3) {
                smallest = num2;
            } else {
                smallest = num3;
            }
        }

        System.out.println("Smallest Number: " + smallest);
    
    }
}
