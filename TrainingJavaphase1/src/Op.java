import java.util.Scanner;

public class Op {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1=s.nextDouble();
        System.out.println("Enter the Second number");
        double num2=s.nextDouble();
        System.out.println("Enter the operation");
        System.out.println("1-Add\n 2-Sub\n 3-Mul\n4-Div");
        int op=s.nextInt();
        switch (op){
            case 1:
                Addition1 a=new Addition1();
                System.out.println("Additon: "+(a.Perf(num1,num2)));
                break;
            case 2:
                Subtract1 b=new Subtract1();
                System.out.println("Subtraction: "+(b.Perf(num1,num2)));
                break;
            case 3:
                Multiple c=new Multiple();
                System.out.println("Multiple: "+(c.Perf(num1,num2)));
                break;
            case 4:
                Division1 d=new Division1();
                System.out.println("Divison: "+(d.Perf(num1,num2)));
                break;
            default:
                System.out.println("Enter a Valid input");
        }
    }
}
class Per{
    double Perf(double a,double b){
        return 0;
    }
}
class Addition1 extends Per{
    double Perf(double a,double b){
        return a+b;
    }
}
class Subtract1 extends Per{
    double Perf(double a,double b){
        return a-b;
    }
}
class Multiple extends Per{
    double Perf(double a,double b){
        return a*b;
    }
}
class Division1 extends Per{
    double Perf(double a,double b){
        if(b!=0){
            return a/b;
        }
        else{
            System.out.println("Enter a non zero number");
            return 0;
        }
    }
}