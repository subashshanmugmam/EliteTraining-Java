import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Second s=new Second();
        System.out.println("Square: "+s.square);

    }
}
class First{
    int n;
    Scanner s=new Scanner(System.in);
    First(){
        System.out.println("Enter the number to Square: ");
    n=s.nextInt();
    }

}
class Second extends First{
    int square;
    Second(){
        square=n*n;

    }
}