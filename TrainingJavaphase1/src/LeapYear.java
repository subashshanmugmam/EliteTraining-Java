import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the Year ");
        Scanner scan=new Scanner(System.in);
        int year=scan.nextInt();
        if((year%4 ==0 &&  year%100!=0) || (year%400==0)){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }
}
