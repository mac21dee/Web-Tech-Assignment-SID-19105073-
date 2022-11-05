class Employee{
    // Create instance variables for employee name , year of joining and address 
    String Employee_name;
    int year_of_joining;
    String address;
    // Create a constructor for intializing the variables
    Employee(String Employee_name,int year_of_joining,String address)
    {
        this.Employee_name = Employee_name;
        this.year_of_joining = year_of_joining;
        this.address = address;
    }
    // create a method for printing employee details 
    void printEmployeeDetails()
    {
        System.out.println(this.Employee_name+" "+this.year_of_joining+" "+this.address);
    }

}
class Ques2 {
    public static void main(String[] args)
    {
        // Create 3 objects of class Employee 
        Employee E1 = new Employee("Robert",1994,"64C- WallsStreat");
        Employee E2 = new Employee("Sam",2000,"68D- WallsStreat");
        Employee E3 = new Employee("John",1999,"26B- WallsStreat");
        System.out.println("Name "+"Year of joining "+"Address");
        E1.printEmployeeDetails();
        E2.printEmployeeDetails();
        E3.printEmployeeDetails();
    }
}