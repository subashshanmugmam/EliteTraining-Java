import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=Scan.nextInt();
        System.out.println("Enter the Second number: ");
        int b=Scan.nextInt();
        System.out.println("Quotient: "+a/b+" Remainder: "+a%b);
    }
}
