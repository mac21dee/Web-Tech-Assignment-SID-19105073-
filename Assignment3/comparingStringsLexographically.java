import java.util.Scanner;
public class comparingStringsLexographically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking string inputs which we have to compare
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        // If one string has big length
        if(s1.length() > s2.length()){
          System.out.println(s1.length()-s2.length());
        }
        else if(s1.length() < s2.length()){
          System.out.println(s1.length()-s2.length());
        }
        else{
            // checking the index where the characters differ and returning the difference
          for(int i=0;i<(s1.length()) && (i<s2.length());i++){
            if((int)s1.charAt(i)==(int)s2.charAt(i))continue;
            else System.out.println((int)s1.charAt(i) - (int)s2.charAt(i));break;

          }
        }
        sc.close();
    }
}
