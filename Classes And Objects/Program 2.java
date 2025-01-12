Design a class BankAccount with the following specification :

Attributes :

accountNumber (string) : Represents the account number of the user's account
balance (double) : Represents the balance of the account
Constructor :

Implement a parameterised constructor to have the accountNmber and balance initialised while creating the object.
Methods :

deposit (double amount) : It adds the amount to the balance of the user's account.
withdraw (double amount) : It deduct the money (amount) from the balance. If the balance is insufficient then print "Insufficient funds!" and do not change the original amount.
displayDetails() : It diplays th accuntNumber and balance of the account.


Refer the sample examples for understanding the output format.

//Your code goes here

class BankAccount
{
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    void deposit(double amount)
    {
        this.balance+=amount;
    }
    void withdraw(double amount)
    {
        if(this.balance<amount)
        {
            System.out.println("Insufficient funds!");
            return;
        }
        else
        {
            this.balance-=amount;
        }
    }
    public void displayDetails()
    {
        System.out.println("Account Number : "+this.accountNumber);
        System.out.printf("Balance : "+"%.2f",this.balance);
        System.out.println();
    }

};
//Please Do not change anything below, It is only for your reference.
/*

This is the driver code that will execute and demonstrate the functionality of your `BankAccount` class.

It creates a object of class `BankAccount`, the objects sets the values of accountNumber and balance using the parameterised constructor.
Then calls the method addBalance to add the balance in the account.
Then it calls the withdrawBalance to withdraw the balance from the account.
At end it displays the details of account using the displayDetails method.



// Main class to demonstrate the functionality of the Student class
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
        // Input account number and initial balance
        String accountNumber = sc.nextLine();
        double balance = sc.nextDouble();

        // Create a BankAccount object with the use of parameterised constructor
        BankAccount account = new BankAccount(accountNumber, balance);

        // Deposit money
        double addBalance = sc.nextDouble();
        account.deposit(addBalance);

        // Withdraw money
        double withdrawBalance = sc.nextDouble();
        account.withdraw(withdrawBalance);

        // Display account details
        account.displayDetails();

        sc.close(); // Close the scanner
    }
}

*/

/*
//Below is the output statements

System.out.println("Insufficient funds!");
System.out.println("Account Number : " + accountNumber);
System.out.println("Balance : " + balance);

*/
