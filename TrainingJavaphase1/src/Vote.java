import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        System.out.println("Enter the First Number: ");
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2=scan.nextInt();
        System.out.println("Maximum Number= "+((num1>num2)?num1:num2));
    }
}
