import java.util.Scanner;

public class OnlinePayment {
    public static void main(String[] args) {
        System.out.println("Enter the Amount: ");
        Scanner s=new Scanner(System.in);
        double amt=s.nextDouble();
        Gpay g=new Gpay();
        g.pay(amt);
        Paypal p=new Paypal();
        p.pay(amt);
        Stripe st=new Stripe();
        st.pay(amt);

    }
}
abstract class Gateway{
    abstract void pay(double amount);
}
class Paypal extends  Gateway{
    double amount;
    void pay(double amount){
        System.out.println("This is Paypal: "+amount);

    }
}
class Gpay extends  Gateway{
    double amount;
    void pay(double amount){
        System.out.println("This is Gpay: "+amount);

    }
}
class Stripe extends  Gateway{
    double amount;
    void pay(double amount){
        System.out.println("This is Stripe: "+amount);

    }
}
