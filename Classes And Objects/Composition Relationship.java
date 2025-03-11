//Your code goes here
class University
{
    private String name;
    private ArrayList<College> colleges;

    University(String name)
    {
        this.name=name;
        colleges=new ArrayList<>();
    }
    public void addCollege(String collegeName,String collegeId)
    {
        // College clg=new College(collegeName,collegeId);
        // Composite Relationship
        //If University Destroyed All The Colleges Will Be Destroyed
        colleges.add(new College(collegeName,collegeId));
    }
    public void displayDetails()
    {
         System.out.println("University Name : " + this.name);
            for(int i=0;i<colleges.size();i++)
            {
                College clg=colleges.get(i);
                System.out.println("College Name : " + clg.getName());
                System.out.println("College ID : " + clg.getId());
            }

    }
   
}
class College
{
    private String name;
    private String id;
    College(String name, String id)
    {
        this.name=name;
        this.id=id;
    }
    public String getName()
    {
        return this.name;
    }
    public String getId()
    {
        return this.id;
    }
}



//Please Do not change anything below, It is only for your reference.
/*

This is the driver code that will execute and demonstrate the functionality of your class `University` and the class 'College'.


public class Main {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String name;
        List<String> collegeName, collegeId;

        //creating the object of class University with the name as constructor argument
        University university = new University(name);
        
        //adding the collge names and id using the addCollege mthod called through the university object
        for (int j = 0; j < collegeName.size(); j++) {
            university.addCollege(collegeName.get(j), collegeId.get(j));
        }

        //calling the method displayDetails through the university object
        university.displayDetails();

        scanner.close();
    }
}

*/

/*
//Below is the output format

System.out.println("University Name : " + name);
System.out.println("College Name : " + name);
System.out.println("College ID : " + id);

*/
