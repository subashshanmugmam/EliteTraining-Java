import java.util.Scanner;

public class Inheritance1 {
    public static void main(String[] args) {
        Designer d = new Designer();
        System.out.println("Name: "+d.name);

        System.out.println("Salary per project payment: "+((d.Salary)/d.projectcount));
        Developer dev=new Developer();
        System.out.println("Total Income: "+(dev.Salary+ dev.bonus));
    }
}
class Employee{
    Scanner s=new Scanner(System.in);
    String name;
    double Salary;
    Employee(){
        System.out.println("Enter Your Name: ");
        name=s.next();
        System.out.println("Enter your Salary");
        Salary=s.nextDouble();
}
}
class Developer extends Employee {
    int bonus;
    Developer() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Bonus");
        bonus = s.nextInt();
    }
}
class Designer extends Employee {
    int projectcount;
    Designer() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Project Count");
        projectcount = s.nextInt();
    }
}