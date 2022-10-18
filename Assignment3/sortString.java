import java.util.Scanner;
import java.util.Arrays;
public class sortString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Take the string that needs to be sorted as input
        String s = sc.nextLine();
        // change it to char array
        char arr[] = s.toCharArray();
        // apply the sort method to sort the array
        Arrays.sort(arr);
        //Add result to the string 
        s = new String(arr);
        System.out.println(s);
        sc.close();
    }
}
