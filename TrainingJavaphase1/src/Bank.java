

public class Bank {
    public static void main(String[] args) {
        BankAccount s=new SavingAccount(159984);
        BankAccount c=new CurrentAccount(9587398);
        s.deposit(918490);
        c.deposit(9890);
        s.withdraw(8327);
        c.withdraw(243);



    }
}
abstract class BankAccount{
    double balance;
    BankAccount(double balance){
        this.balance=balance;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    void displayInfo(){
        System.out.println("Balance: "+balance);
    }
}
class SavingAccount extends BankAccount{
    double maxlimit=10000;
    SavingAccount(double balance){
        super(balance);
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Amount Deposited Successfully in SavingsAccount");
        System.out.println("Total amount: "+balance);
    }
    void withdraw(double amount){
        if(amount<=maxlimit && amount<=balance){
            balance-=amount;
            System.out.println("Amount withdraw successfully from the savingaccount");
            System.out.println("Balance: "+balance);
        }
    }

}
class  CurrentAccount extends BankAccount{
    double maxlimit=10000;
    CurrentAccount(double balance){
        super(balance);
    }

    void deposit(double amount){
        balance+=amount;
        System.out.println("Amount Deposited Successfully in currentAccount");
        System.out.println("Total amount: "+balance);
    }
    void withdraw(double amount){
        if(amount<=maxlimit && amount<=balance){
            balance-=amount;
            System.out.println("Amount withdraw successfully from the currentaccount");
            System.out.println("Balance: "+balance);
        }
    }
}