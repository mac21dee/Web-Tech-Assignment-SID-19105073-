// import java.util.Scanner;
public class IncreasingPopulation {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        double initial_population = 80000;
        double increment = (5*80000)/100;
        double percent_inc = 5;
        double threshold_population = 150000;
        int years = 0;
        double div = 100;
        // increment till the population is less than 150,000
        while(initial_population <=threshold_population){
            initial_population += increment;
            // increment by 5%
            increment = (percent_inc*initial_population)/div;
            // System.out.println(increment);
            // increment years by 1
            years++;
        }
        System.out.println("Population will exceed 150,000 after " + years + " years");
        // sc.close();
    
    }
}
