import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        System.out.println("Enter the number of passengers Travelling");
        Scanner s=new Scanner(System.in);
        int passenger=s.nextInt();
        int fare=0;
        for (int i = 0; i < passenger; i++) {
            System.out.println("Enter the Age of The Passenger: ");
            int age=s.nextInt();
            if (age<=5){
                System.out.println("Free - 0");
                fare+=0;
            } else if (age>6 && age<18) {
                System.out.println("Child Fare-10");
                fare+=10;
            } else if (age>=19 && age<=60) {
                System.out.println("Adult Fare-20");
                fare+=20;
            } else if (age>60) {
                System.out.println("Senior Citizen-15");
                fare+=15;
            }
        }
        System.out.println("Total Fare Of All Passengers: "+fare);

    }
}
