//Your code goes here


class ShapeCalculator
{
    public void area(int radius)
    {
        System.out.println("Area of Circle : "+(int)(3.14*(radius*radius)));
    }
    public void area(int len, int wid)
    {
        System.out.println("Area of Rectangle : "+Math.round(len*wid));
    }
    public void area(int b1, int b2, double h1)
    {
        System.out.println("Area of Trapezoid : "+(int)((b1+b2)*h1)/2);
    }
}

//Please Do not change anything below, It is only for your reference.
/*

This is the driver code that will execute and demonstrate the functionality of your class `ShapeCalculator`.

It creates a object of class `ShapeCalculator`.
It then calls the area method with radius as an argument. The method calculates the area of Circle and prints it.
It then calls the area method with length and width as arguments. The method calculates the area of Rectangle and prints it.
It then calls the area method with base1, base2, height as arguments. The method calculates the area of Trapezoid and prints it.


public class Main {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        int radius = scanner.nextDouble();
        int length = scanner.nextDouble();
        int width = scanner.nextDouble();
        int base1 = scanner.nextDouble();
        int base2 = scanner.nextDouble();
        int height = scanner.nextDouble();

        ShapeCalculator sc = new ShapeCalculator();
        sc.area(radius);
        sc.area(length, width);
        sc.area(base1, base2, height);

        scanner.close();
    }
}

*/

/*
//Below are the output statements

System.out.println("Area of Circle : " + result);
System.out.println("Area of Rectangle : " + result);
System.out.println("Area of Trapezoid: " + result);

*/
