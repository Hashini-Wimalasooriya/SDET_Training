public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount1=new BankAccount("John Carton", 100000);

        bankAccount1.withdraw(20000);
        bankAccount1.deposit(100000);

        System.out.println(bankAccount1.getOwner());
        System.out.println(bankAccount1.getBalance());
    }
}