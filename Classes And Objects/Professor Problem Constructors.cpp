// You are using Java
import java.util.*;
class Professor
{
  private int id;
  private String name;
  private int salary;
  Professor()
  {
      
  }
  
  Professor(int id, String name, int salary)
  {
      this.id=id;
      this.name=name;
      this.salary=salary;
  }
  public void display(Professor ob[])
  {
      for(int i=0;i<ob.length;i++)
      {
          int salary=ob[i].salary;
          if(salary>=20000)
          System.out.println(ob[i].id + " "+ob[i].name + " "+ ob[i].salary);
      }
  }
  
};
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        Professor ob[]=new Professor[n];
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            int id=sc.nextInt();
            // sc.nextLine();
            String name=sc.next();
            int salary=sc.nextInt();
            // sc.nextLine();
            
            ob[i]=new Professor(id,name,salary);
        }
        ob[0].display(ob);
        
    }
}
