import java.util.*;
class VectorQues{
    public static void main(String[] args)
    {
        // Take the size of vector as input from user 
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF VECTOR ");
        int size_of_vector = input.nextInt();
        Vector stringsVector = new Vector(size_of_vector+1);
        // Take the objects to be stored in the vector from the user 
        System.out.println("ADD OBJECTS TO THE VECTOR ");
        for(int i =0;i<=size_of_vector;i++)
        {
            String obj = input.nextLine();
            stringsVector.addElement(obj);
        }
        // input.close();
        // Display the values of vector
        System.out.println("PRINT THE VALUES OF VECTOR ");
        for(int i =0;i<=size_of_vector;i++)
        {
           System.out.println(stringsVector.elementAt(i));
        }
        input.close();
    }
}