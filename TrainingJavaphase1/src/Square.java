import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Second s=new Second();

    }
}
class First{
    int n;
    Scanner s=new Scanner(System.in);
    First(){
    n=s.nextInt();
    }

}
class Second extends First{
    Second(){
        System.out.println(n*n);
    }
}