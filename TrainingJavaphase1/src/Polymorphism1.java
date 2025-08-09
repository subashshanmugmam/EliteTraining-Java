public class Polymorphism1 {
//    Example of overriding
public static void main(String[] args) {
    Child c=new Child();
    c.Sound();
    c.Display();
}
}
class Parent{
    void Sound(){
        System.out.println("This is Parent");
    }
}
class   Child extends Parent{

    void Sound(){
        System.out.println("This is child");
//        System.out.println(super.Sound());
    }
    void Display(){
        super.Sound();
    }
}
