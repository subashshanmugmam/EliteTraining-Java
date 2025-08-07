import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        if (a < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }
}
