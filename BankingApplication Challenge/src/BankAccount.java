public class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner, double startingBalance){
        this.owner=owner;
        this.balance=startingBalance;
    };

    public String getOwner(){
        return owner;
    };

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        if(amount>0) {
            this.balance = this.balance + amount;
            return amount;
        }
        return 0;
    };

    public double withdraw(double amount) {
        if(amount<=this.balance) {
            this.balance = this.balance - amount;
            return amount;
        }

        return 0;
    };

}
