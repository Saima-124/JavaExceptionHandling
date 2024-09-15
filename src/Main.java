public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("2312076123", 100.0);

        try {
            account.deposit(50.0);
            account.withdraw(200.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());


        }
        try{
            account.withdraw(50.0);
            account.deposit(-10.0); // This will throw InvalidAmountException
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Final balance: $" + account.getBalance());
            System.out.println("End of transaction.");
        }
    }
}