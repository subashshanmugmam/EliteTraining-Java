public class Pay {
    public static void main(String[] args) {
        Payment payment;
        payment =new CreditCardPayment();
        payment.processpayment();
        payment =new CashPayment();
        payment.processpayment();
        payment=new UPIPayment();
        payment.processpayment();
    }
}
class Payment{
    void processpayment() {
        System.out.println("Processing Payment ");
    }
}
class CreditCardPayment extends Payment{

    void processpayment(){
        System.out.println("Processing Credit Card Payment ");
    }

}
class UPIPayment extends Payment{

    void processpayment(){
        System.out.println("Processing UPIPayment ");
    }
}
class CashPayment extends Payment{
    void processpayment(){
        System.out.println("Processing CashPayment ");
    }

}

