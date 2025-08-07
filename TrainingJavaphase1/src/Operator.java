import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        System.out.println("Enter the First Number: ");
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2=scan.nextInt();
        System.out.println("Additon: "+(num1+num2));
        System.out.println("Subtraction: "+(num1>num2?(num1-num2):(num2-num1)));
        System.out.println("Multiplication: "+(num1*num2));
        System.out.println("Division: "+(num1>num2?(num1/num2):(num2/num1)));
        System.out.println("Quotient: "+(num1>num2?(num1%num2):(num2%num1)));
    }
}
