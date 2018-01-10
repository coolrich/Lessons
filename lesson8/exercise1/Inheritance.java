package lesson8.exercise1;

/**
 * Created by student on 10.01.2018.
 */
class Student {
    private String name;

    private String group;
    public Student(String n, String g){
        name=n;
        group=g;
    }
    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }
}
class Aspirant extends Student{
    private String scientificWork;
    public Aspirant(String n,String g,String sw){
        super(n,g);
        scientificWork=sw;
    }

    public String getScientificWork() {
        return scientificWork;
    }
}
public class Inheritance{
    public static void main(String[] args) {
        System.out.println(new Student("Someone","TL-11").getName());
        System.out.println(new Aspirant("SomeoneElse","TP-11","Ion implantation of Nitrides").getName());
        Student s = new Aspirant("SomeoneElse","TP-11","Ion implantation of Nitrides");
        System.out.println(s.getName());

    }
}
