public class Polymorphism {
//Example of overloading
    public static void main(String[] args) {
        Leo l=new Leo();
        System.out.println(l.add(56.6,65.72));
        System.out.println(l.add(42,84));

    }

}
class Leo{
    double add(double a,double b){
        return a+b;
    }
    int add(int a,int b){
        return a+b;
    }
}
