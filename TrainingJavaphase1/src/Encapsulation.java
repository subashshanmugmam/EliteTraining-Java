import java.util.Scanner;

public class Encapsulation {
    private String name;
    private double  Salary;
    public void setName(String names) {
        if (names != null) {

            name = names;
        }
    }
    public void setSalary(double Salar){
            if (Salar >=10000) {
                Salary = Salar;
            }
            else{
                Salary=0;
            }
        }
    public String getName(){
        return name;
    }
    public double getSalary(){
         return Salary;
    }



}
class Ena {
    public static void main(String[] args) {
        Encapsulation E = new Encapsulation();
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        double salary=s.nextDouble();
        E.setName(name);
        E.setSalary(salary);
        System.out.println("Name: "+E.getName());
        System.out.println("Salary: "+E.getSalary());

    }
}

