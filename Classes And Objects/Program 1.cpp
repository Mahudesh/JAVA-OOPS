You are tasked with designing a class Student that stores and displays information about students.

The class must have the following :



Attributes :

name (string) : Stores the name of the student.
rollNumber (int) : Stores the roll number of the student
Methods :

setDetails (String name, int rollNumber) : This method initializes the attributes name and rollNumber with the values provided by the user.
displayDetails() : This method prints the details of the student in following format (The output consist of two separate lines) :


Refer the sample input example to understand the output format.

Refer the commented code on IDE for output statements.

// Your code goes here

class Student {
    int rollNumber;
    String name;
    void setDetails(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNumber);
    }
};
// Please Do not change anything below, It is only for your reference.
/*

This is the driver code that will execute and demonstrate the functionality of
your `Student` class.

It creates a `Student` object, initializes its details using user input, and
displays the details using the provided methods.

// Main class to demonstrate the functionality of the Student class
public class Main {
    public static void main(String[] args) {

        // Create a Scanner object for taking input from the user
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine(); // Read the name as a string input

        int rollNumber = sc.nextInt(); // Read the roll number as an integer
input

        // Create an object of the Student class
        Student student = new Student();

        // Set the details of the student using the setDetails() method
        student.setDetails(name, rollNumber);

        // Display the student's details using the displayDetails() method
        student.displayDetails();

        // Close the Scanner to free resources
        sc.close();
    }
}

*/

/*
//Below are the output statements

System.out.println("Name : " + this.name);
System.out.println("Roll Number : " + this.rollNumber);

*/
