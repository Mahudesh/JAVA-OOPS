//Your code goes here

class Rectangle
{
    private double length;
    private double width;
    private double area;
    Rectangle()
    {
        length=width=1.0;
    }
    Rectangle(double length, double width)
    {
        this.length=length;
        this.width=width;
    }
    public double calculateArea()
    {
        this.area =  length*width;
        return area;
    }
    public void displayDetails()
    {
        System.out.printf("Length : "+"%.2f",this.length);
        System.out.println();
        System.out.printf("Width : "+"%.2f",this.width);
        System.out.println();
        System.out.printf("Area : "+"%.2f",this.area);
        System.out.println();
    }
};


//Please Do not change anything below, It is only for your reference.
/*

This is the driver code that will execute and demonstrate the functionality of your `Rectangle` class.

It creates two different objects of class `Rectangle`, the first object is used to test the implementation of default constructor
And the second object is used to test the implementation of parameterized constructor.



// Main class to demonstrate the functionality of the Student class
public class Main {
    public static void main(String[] args) {
    
        // Create a Scanner object for taking input from the user
        Scanner sc = new Scanner(System.in);

        //Read th length ad width from the user as double input
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        // Create first object of rectangle class using the default constructor
        Rectangle r1 = new Rectangle();
        r1.calculateArea();
        r1.displayDetails();

        // Create second object of rectangle class using the parameterized constructor
        Rectangle r2 = new Rectangle(length, width);
        r2.calculateArea();
        r2.displayDetails();

        sc.close(); // Close the scanner
    }
}

*/

/*
//Below are the output statements

System.out.println("Length : " + this.length);
System.out.println("Width : " + this.width);
System.out.println("Area : " + this.area);

*/
