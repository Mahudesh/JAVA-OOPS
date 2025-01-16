// You are using Java
import java.util.*;
import java.text.*;
class Box
{
    private double width,height,depth;
  
    Box()
    {
        width=height=depth=0;
    }
    Box(double w, double h, double d)
    {
        this.width=w;
        this.height=h;
        this.depth=d;
    }
    Box(double len)
    {
        this.width=len;
        this.height=len;
        this.depth=len;
    }
    public double volume()
    {
        return width*height*depth;
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        DecimalFormat df=new DecimalFormat("0");
        double w=sc.nextDouble();
        double h=sc.nextDouble();
        double dep=sc.nextDouble();
        
        double cube=sc.nextDouble();
        
        Box ob1 = new Box();
        System.out.println("Volume of mybox1 is "+df.format((ob1.volume())));
        Box ob2 = new Box(w,h,dep);
        System.out.println("Volume of mybox2 is "+df.format(ob2.volume()));
        Box ob3 = new Box(cube);
        System.out.println("Volume of mycube is "+df.format(ob3.volume()));
        
    }
}
