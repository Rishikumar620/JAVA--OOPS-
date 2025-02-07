public class Bank {
    public String name;
    public double accountno;
    public double balance;
    public String accounttype;

    public Bank(String name, double accountno, double balance, String accounttype) {
        this.name = name;
        this.accountno = accountno;
        this.balance = balance;
        this.accounttype = accounttype;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited amount is " + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn amount is " + amount);
        }
    }

    public void transfertoaccount(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Transferred amount is " + amount);
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountno);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Type: " + accounttype);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Bank b = new Bank("Rishi", 12345, 1000, "Savings");
        b.display();
        b.deposit(500);
        b.display();
        b.withdraw(200);
        b.display();
        b.transfertoaccount(300);
        b.display();
    }

}
