//Your code goes here
class Employee
{
    public String name;
    protected int employeeId;
    private double salary;

    Employee(String name,int employeeId,double salary)
    {
        this.name=name;
        this.employeeId=employeeId;
        if(salary<0)
        {
            System.out.println("Invalid salary");
            this.salary=0;
        }
        else{
        this.salary=salary;
        }
    }
    public void setSalary(double salary)
    {
        if(salary<0)
        {
              System.out.println("Invalid salary");
              this.salary=0;
        }
        else
        {
            this.salary=salary;
        } 
    }
    public double getSalary()
    {
        return this.salary;
    }

    public void displayEmployeeDetails()
    {
        
        System.out.println("Name : " + this.name);
        System.out.println("Employee Id : " + this.employeeId);
        System.out.printf("Salary : %.2f\n" , this.salary);
    }
}



//Please Do not change anything below, It is only for your reference.
/*

This is the driver code that will execute and demonstrate the functionality of your `Employee` class.

It creates a object of class `Employee`, the parameterised constructor sets the values of nam, employeeId, salary attributes.
It calls the getSalary method to display the salary set by parameterised constructor.
It then calls the setSalary mehod to set the newSalary.
Then simple displayEmployeeDetails is called to prin the details of employee in specified format.


// Main class to demonstrate the functionality of the Student class
public class Main {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
            
        String name;
        int employeeId;
        double salary;
        double newSalary;

        // Create an Employee object
        Employee employee = new Employee(name, employeeId, salary);

        // Get and print the salary
        System.out.printf("Salary : %.2f\n", employee.getSalary());

        // Update the salary
        employee.setSalary(newSalary);

        // Display employee details
        employee.displayEmployeeDetails();

        sc.close();
    }
}

*/

/*
//Below is the output format

System.out.println("Name : " + name);
System.out.println("Employee Id : " + employeeId);
System.out.printf("Salary : %.2f\n" , salary);

*/
