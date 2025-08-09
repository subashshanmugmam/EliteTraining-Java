import java.util.Scanner;


interface NumberOperations {
    void checkEvenOdd(int n);
    void findFactorial(int n);
}

class UI {
    protected int number;

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
    }
}

class Result extends UI implements NumberOperations {

    @Override
    public void checkEvenOdd(int n) {
        if (n % 2 == 0)
            System.out.println(n + " is Even.");
        else
            System.out.println(n + " is Odd.");
    }

    @Override
    public void findFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}

public class EvenOddFactorial{
    public static void main(String[] args) {
        Result r = new Result();
        r.getInput();
        r.checkEvenOdd(r.number);
        r.findFactorial(r.number);
    }
}