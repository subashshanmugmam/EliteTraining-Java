
import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Subash bank of India(SBI)");
        int AvailableBalance=10000;
        int pass=123;
//        int AccountNumber=123456;
        Scanner S=new Scanner(System.in);
//        System.out.println("Enter your Account Number");
//        int AcNo=S.nextInt();
        System.out.println("Enter the Password ");
        int password=S.nextInt();
        S.nextLine();
        int attempt=0;
        for (int i = 0; i <2 ; i++) {
            if(!PassWordCheck(password,pass)) {
                attempt+=1;
                System.out.println("Enter the Password again(maz 3 attempts): "+(3-attempt)+"Available");
                password=S.nextInt();
                PassWordCheck(password,pass);
                if (attempt==3){
                    System.out.println("Account Locked");
            }
        }


           System.out.println("Enter the option: \n Deposit \n WithDraw Money\n Check Balance\n Exit");


        String input=S.nextLine();

        switch (input) {
            case "Deposit":
                System.out.println("Enter the Amount to Deposit");
                int amount=S.nextInt();
                System.out.println("Amount Entered: "+amount);
                AvailableBalance+=amount;
                System.out.println("AvailableBalance: "+AvailableBalance);
                break;
            case "WithDraw":
                System.out.println("Enter the amount to Withdraw:");
                int Withdraw=S.nextInt();
                if(AvailableBalance==0){
                    System.out.println("Nill-Low Balance");
                }
                if(AvailableBalance>Withdraw) {

                    System.out.println("Amount Withdrawed: " +Withdraw);
                    AvailableBalance-=Withdraw;
                    System.out.println("AvailableBalance: "+AvailableBalance);

                }
                else {
                    System.out.println("Insuffient Balance");
                    System.out.println("AvailableBalance: "+AvailableBalance);
                    System.out.println("Enter the amount less than the available balance");
                }
                break;
            case "CheckBalance":
                System.out.println("AvailableBalance: "+AvailableBalance);
                break;
            case "Exit":
                System.out.println("Exit From the System");
                System.out.println("Have a Happy Day ");
            default:
                System.out.println("Enter the Valid Input");
        }}
        S.close();

    }

    static boolean PassWordCheck(int password,int pass){
//        int attempt=0;

            if (password == pass) {
                return true;

        }

        return false;
    }


}
