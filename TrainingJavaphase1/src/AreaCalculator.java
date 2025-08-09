import java.util.Scanner;

public class AreaCalculator {


    public static void main(String[] args) {
//        Calculator1 c=new Calculator1();
//        System.out.println("Rectangle: "+c.aarea1());
//        System.out.println("Triangle: "+c.aarea());

    }
}
interface Triangle{
    int area();
}
interface Rectangle{
    int area1();
}
class Calculator1 implements Triangle,Rectangle{
    Scanner s=new Scanner(System.in);
     public int area() {
        System.out.println("Enter the height and width for Triangle");
       int  height=s.nextInt();
        int breadth=s.nextInt();

        return height*breadth;

    }
    public int area1(){
        System.out.println("Enter the height and width for Rectangle");
        int  height=s.nextInt();
        int breadth=s.nextInt();
        return height*breadth;
    }
}