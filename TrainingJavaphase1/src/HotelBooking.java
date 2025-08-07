
import java.util.Scanner;
import java.util.Random;
public class HotelBooking {
    public static void main(String[] args) {
        int n=5;
        int[][] hotel = new int[n][n];
        Random r = new Random(0);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the option\n 1-Viewallrooms \n 2-Bookaroom\n 3-Cancelabooking\n 4-checkroomstatus");
        String option = s.next();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hotel[i][j] = r.nextInt(2);
            }

        }

        switch (option) {
            case "1":

                Viewallrooms(hotel);
                break;
            case "2":
                Viewallrooms(hotel);
                System.out.println("Enter the floor number:");
                int floor = s.nextInt();
                System.out.println("Enter the room number:");
                int room = s.nextInt();
                if (Bookaroom(hotel, floor, room)) {
                    System.out.println("Floor: "+floor+"Room"+room);
                    System.out.println("Room Booked Successfully");

                } else {
                    System.out.println("Enter the floor number:");
                    floor = s.nextInt();
                    System.out.println("Enter the room number:");
                    room = s.nextInt();
                    Bookaroom(hotel,floor,room);
                }
                break;
            case "3":
                Viewallrooms(hotel);
                System.out.println("Enter a room want to Cancel");
                System.out.println("Enter the floor number:");
                int floor1 = s.nextInt();
                System.out.println("Enter the room number:");
                int room1 = s.nextInt();
                if(CancelBooking(hotel,floor1,room1)){
                    System.out.println("Floor: "+floor1+"Room"+room1);
                    System.out.println("Room Booked Successfully");
                    Viewallrooms(hotel);
                }
                else {
                    System.out.println("Enter a room want to Cancel");
                    System.out.println("Enter the floor number:");
                    floor1 = s.nextInt();
                    System.out.println("Enter the room number:");
                    room1 = s.nextInt();
                    CancelBooking(hotel, floor1, room1);
                }
                break;
            case "4":
                System.out.println("Enter the room to check the room status");
                System.out.println("Enter the floor number:");
                int floor2 = s.nextInt();
                System.out.println("Enter the room number:");
                int room2 = s.nextInt();
                Checkroomstatus(hotel, floor2, room2);
                break;
            default:
                System.out.println("Enter a Valid input");
        }
    }


    static void Viewallrooms(int[][] Hotel) {
        for (int i = 0; i < Hotel.length; i++) {
            for (int j = 0; j < Hotel.length; j++) {
                if(Hotel[i][j]==0) System.out.println(i+"th Floor "+j+"Room is available");

//                System.out.println("Floor = rows and Rooms = columns");

                else System.out.println(i+"th Floor "+j+"Room is not available");
            }

        }
    }
    static boolean Bookaroom(int[][] Hotel, int floor, int room) {
        if (Hotel[floor][room] == 0) {
            System.out.println("Room Available");
            Hotel[floor][room] = 1;
            return true;
        } else {
            System.out.println("sorry the Room is not available");
        }
        return false;
    }
    static boolean CancelBooking(int [][] hotel,int floor,int room){

            if (hotel[floor][room] != 0) {
                System.out.println("Room Booking Canceled");
                hotel[floor][room] = 0;
                return true;
            } else {
                System.out.println("The room is not booked\n Unable to cancel");
                System.out.println("Enter a valid room number to cancel");
            }
            return false;
        }
    static void Checkroomstatus(int[][] hotel,int floor2,int room2){
        Viewallrooms(hotel);
        if(hotel[floor2][room2]==1){
            System.out.println("Room Already Booked");
        }
        else {
            System.out.println("Room is free and Available to book");
        }
    }
}
