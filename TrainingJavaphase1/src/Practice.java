import java.util.Scanner;
import java.lang.String;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Enter Your Age: ");
        Scanner S=new Scanner(System.in);
        int age=S.nextInt();
        System.out.println("Age= "+age);
        S.nextLine();
        System.out.println("Enter your Name");
        String name=S.nextLine();

        System.out.println("Enter your Height");
        float height=S.nextFloat();
        System.out.println("Enter your Weight");
        float weight=S.nextFloat();
        System.out.println("Name"+name);
        System.out.println("Height "+height);
        System.out.println("Weight "+weight);
        System.out.println("Enter the First Subject Marks");
        int sub1=S.nextInt();
        System.out.println("Enter the Second Subject Marks");
        int sub2=S.nextInt();
        System.out.println("Enter the Third Subject Marks");
        int sub3=S.nextInt();
        System.out.println("Total Marks: "+(sub1+sub2+sub3));
        int Change=25;
        System.out.println("BeforChange: "+Change);
        Change=95;
        System.out.println("AfterChange: "+Change);
        int a=5;
        int b=10;
        System.out.println("Sum: "+(a+b));






    }
}
