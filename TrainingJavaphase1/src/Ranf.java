import java.util.Random;
import java.util.Scanner;

public class Ranf {
    public static void main(String[] args) {
        Random random = new Random();

        boolean isguess = false;
        int attempt = 0;
        while (!isguess) {
            int randomInt = random.nextInt(1, 101);
            System.out.println("Enter The Random: ");
            Scanner S = new Scanner(System.in);
            int Guess = S.nextInt();
            attempt += 1;
//        System.out.println((Guess==randomInt)?("You are right"+randomInt):((Guess<randomInt)?("Your Guess is low.Since the Random Value is "+randomInt):("Your Guess is high.Since the Random Value is "+randomInt)));
            if (Guess == randomInt) {
                System.out.println("You are right: " + randomInt);
                System.out.println("Attempt to guess: "+attempt);
                isguess = true;
            } else {
                if (Guess < randomInt) {
                    System.out.println("Your Guess is low.Since the Random Value is " + randomInt);
                } else {
                    System.out.println("Your Guess is high.Since the Random Value is " + randomInt);
                }
            }
        }
    }


}
