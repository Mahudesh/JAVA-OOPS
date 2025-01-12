Develop a class TelephoneIndex with two String objects as members. One should hold people’s names and the other should hold their phone number. Create an array of objects for TelephoneIndex and do the following:



a) Your program should ask the user to enter a name or the first few characters of a name to search for it in the array.

b) The program should display all of the names that match the user’s input and their corresponding phone numbers.

Input format :
First-line has the number of records N in the Telephone Index. Following N*2 lines has the name and phone number one below the other as shown in The sample test case. The last line has the name(substring) to be found.

Output format :
The output displays the details of the matching records shown in the sample test case.

// You are using Java
import java.util.*;
class Demo
{
    private String name;
    private String phone;
    
    Demo(String name, String phone)
    {
        this.name=name;
        this.phone=phone;
    }
    
    void display(String key)
    {
        if(this.name.startsWith(key))
        System.out.println(this.name+" "+this.phone);
    }
};
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        sc.nextLine();
        
        Demo ob[]=new Demo[n];  
        for(int i=0;i<n;i++)
        {
            String name=sc.nextLine();
            String phone=sc.nextLine();
            
            ob[i]=new Demo(name,phone);
            
        }
        String key=sc.nextLine();
        for(int i=0;i<n;i++)
        {
            ob[i].display(key);
        }
        
    }
}
