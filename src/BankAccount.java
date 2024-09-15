public class BankAccount {
    private String accountNumber;
    private double balance ;


    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public BankAccount(double balance, String accountNumber) {
        this.balance = 100.0;
        this.accountNumber = accountNumber;
    }
    public void deposit (double amount) throws InvalidAmountException{
        System.out.println("Attempting to deposit $" + amount);
        if(amount <= 0 ){
            throw new InvalidAmountException("Invalid amount !");
        }
        System.out.println("Depositing $" + amount + ".");
        balance = balance + amount;
        System.out.println("New balance $" + amount );




    }
    public void withdraw(double amount) throws InsufficientFundsException{
        System.out.println("Attempting to withdraw $" + amount );
        if(amount > balance || amount <= 0){
            throw new InsufficientFundsException("Insufficient amount !");
        }
        balance = balance - amount;
        System.out.println("New balance $" + amount );


    }

    public double getBalance() {
        return balance;
    }

}
