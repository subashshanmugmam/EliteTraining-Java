import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Balance: ");
        double balance=s.nextDouble();
        System.out.println("1-Saving\n2-Current");
        int check=s.nextInt();
        switch (check){
            case 1:
                Saving sa=new Saving(balance);
                sa.SavingAcount();
                break;
            case 2:
                Current c=new Current(balance);
                c.CurrentAccount();
                break;
            default:
                System.out.println("Enter the valid input");
        }
    }
}
class Balance{
    double balance;
    Balance(double balance){
        this.balance=balance;
    }
}
class Saving extends Balance{
    float interest;
    Saving(double balance){
        super(balance);
        interest=0.5F;
    }
    void SavingAcount(){
        System.out.println("Balance of the interest: "+(balance*interest));
    }
}
class Current extends Balance{
    float interest;
    Current(double balance){
        super(balance);
        interest= 0.3F;
    }
    void CurrentAccount(){
        System.out.println("Balance of the interest: "+(balance*interest));
    }
}