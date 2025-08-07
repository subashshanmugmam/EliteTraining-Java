import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("Enter Your Purchase Amount: ");
            float amt=input.nextFloat();
            System.out.println("Enter your Membership: ");
            String mem=input.next();
            switch (mem){
                case "Gold":
                    System.out.println("Your Discount is 20 % is "+(amt*0.20));
                    System.out.println("Amount to pay:"+(amt-amt*0.20));
                    break;
                case "Silver":
                    System.out.println("Your Discount is 15% is "+(amt*0.15));
                    System.out.println("Amount to pay:"+(amt-amt*0.15));
                    break;
                case "General":
                    System.out.println("Your Discount is 10% is "+(amt*0.10));
                    System.out.println("Amount to pay:"+(amt-amt*0.15));
                    break;
                default:
                    System.out.println("Enter the valid Category");;
                    System.out.println("Better Luck next Time");
            }
            System.out.println("Enter 1 to Stop the application");
            if(input.nextInt()==1) break;

        }

    }
}
