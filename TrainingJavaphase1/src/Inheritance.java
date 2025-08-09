public class Inheritance {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println("Name: "+s.name+" Age: "+s.age+" Rollno: "+s.rollno+" Marks: "+s.marks);
        System.out.println("Grade: "+((s.marks)>90?"A":(s.marks<90&& s.marks>75?"B":(s.marks<75 && s.marks>50?"C":"F"))));
    }
}
class Subash {
        String name="Atom";
        int age=25;

        Subash(){
            System.out.println("I am learning");
            age=age+10;
        }
}
class Student extends Subash{
    int rollno=192;
    int marks=84;

}
