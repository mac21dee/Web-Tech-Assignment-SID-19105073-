class Employee{
    String Employee_name;
    int year_of_joining;
    String address;
    Employee(String Employee_name,int year_of_joining,String address)
    {
        this.Employee_name = Employee_name;
        this.year_of_joining = year_of_joining;
        this.address = address;
    }
    void printEmployeeDetails()
    {
        System.out.println(this.Employee_name+" "+this.year_of_joining+" "+this.address);
    }

}
class Ques2 {
    public static void main(String[] args)
    {
        Employee E1 = new Employee("Robert",1994,"64C- WallsStreat");
        Employee E2 = new Employee("Sam",2000,"68D- WallsStreat");
        Employee E3 = new Employee("John",1999,"26B- WallsStreat");
        System.out.println("Name "+"Year of joining "+"Address");
        E1.printEmployeeDetails();
        E2.printEmployeeDetails();
        E3.printEmployeeDetails();
    }
}