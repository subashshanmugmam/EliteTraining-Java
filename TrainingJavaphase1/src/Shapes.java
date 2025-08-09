import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        System.out.println("Enter the Shape: ");
        Scanner s=new Scanner(System.in);
        String shape=s.nextLine().toLowerCase();
        switch (shape){
            case "triangle":
                System.out.println("Enter the base");
                double base=s.nextDouble();
                System.out.println("Enter the Height");
                double height=s.nextDouble();
                Triangles t=new Triangles(base,height);
                t.draw();
                System.out.println(t.calculateArea());
                break;
            case "square":
                System.out.println("Enter the Square value");
                double sq=s.nextDouble();
                Squares squ=new Squares(sq);
                squ.draw();
                System.out.println(squ.calculateArea());
                break;
            case "circle":
                System.out.println("Enter the radius");
                double r=s.nextDouble();
                Circle c=new Circle(r);
                c.draw();
                System.out.println(c.calculateArea());
                break;
            default:
                System.out.println("Enter a valid input");
        }


    }
}
abstract class Shape{
    abstract  void draw();
    abstract  double calculateArea( );
}
class  Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    void draw() {
        System.out.println("Circle is drawing: ");
    }
    double calculateArea(){
        return Math.PI * radius*radius;
    }
}
class Squares extends Shape{
    double n;
    Squares(double n){
        this.n=n;
    }
    void draw(){
        System.out.println("Drawing Circle: ");
    }
    double calculateArea(){
        return n*n;
    }


}
class Triangles extends Shape{
    double base;
    double height;
    Triangles(double base,double height){
        this.base=base;
        this.height=height;
    }
    void draw(){
        System.out.println("Drawing Triangle");
    }
    double calculateArea(){
        return 0.5*height*base;
    }
}