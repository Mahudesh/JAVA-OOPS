class Account
{
    private String name;
    private int bal;
    Account(String name, int bal)
    {
        this.bal=bal;
        this.name=name;
    }
    public String getName()
    {
      return this.name;
    }
    public int getBalance()
    {
        return this.bal;
    }
    Account(Account ob1)
    {
        //this Keyword Is Used To Call The Constructor Of The Same Class
       this (ob1.getName(), ob1.getBalance());
    }
    
    
};
class Main
{
    public static void main(String args[])
    {
        Account ob1 = new Account("Mahu",10000);
        Account ob2 = new Account(ob1);
        System.out.println(ob2.getName() + " "+ ob2.getBalance());
    }
}
