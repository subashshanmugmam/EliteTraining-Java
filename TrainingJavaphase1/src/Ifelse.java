import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        System.out.println("Enter Your Marks: ");
        Scanner S=new Scanner(System.in);
        int Marks=S.nextInt();
        if(Marks>=90){
            System.out.println("A");
        } else if (Marks>=75 && Marks<=89) {
            System.out.println("B");
        } else if (Marks>=50 && Marks<=74) {
            System.out.println("C");
        } else if (Marks<50) {
            System.out.println("F");
        }
        else {
            System.out.println("Enter a Valid Number");
        }
    }
}
