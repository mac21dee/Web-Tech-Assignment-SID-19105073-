import java.util.Scanner;
public class IncrementScore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // variable to store score
        double x;
        // taking input
        x = sc.nextDouble();
        double y= 80;
        double z = 90;
        double f =5;
        // checking for conditions
        if((x >y) && (x<z)){
            x +=f;
        }
        System.out.println("Final Score : " + x);
        // close scanner to avoid memory leak
        sc.close();
    
    }
    
}
