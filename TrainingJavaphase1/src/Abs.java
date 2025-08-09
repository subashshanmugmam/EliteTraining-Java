import java.util.Scanner;

public class Abs {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the type of vehicle");
        String Type=s.nextLine().toLowerCase();
        System.out.println("Enter the days");
        int days=s.nextInt();
        switch (Type){
            case "car":
                Car c=new Car();
                System.out.println(c.calculateRent(days));
                c.displayinfo();
                break;
            case "bike":
                Bike b=new Bike();
                System.out.println(b.calculateRent(days));
                b.displayinfo();
                break;
            case "truck":
                Truck t=new Truck();
                System.out.println(t.calculateRent(days));
                t.displayinfo();
                break;
            default:
                System.out.println("Enter a valid input");
        }
    }
}
abstract class Vehicle{
    abstract double calculateRent(int days);
    abstract void displayinfo();
}
class Car extends Vehicle {
   double calculateRent(int days){
       return days*2000;
   }
   void displayinfo(){
       System.out.println("Vehicle Type:car ");
   }
}
class Bike extends Vehicle{
    double calculateRent(int days){
        return days*1000;
    }
    void displayinfo(){
        System.out.println("Vehicle Type:car ");
    }
}
class Truck extends Vehicle{
    double calculateRent(int days){
        return days*3000;
    }
    void displayinfo(){
        System.out.println("Vehicle Type:car ");
    }
}
