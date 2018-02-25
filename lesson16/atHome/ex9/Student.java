package lesson16.atHome.ex9;

import java.util.*;

public class Student {
    public static List<Student> students = new ArrayList<>();
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> marks;

    public Student(String name, String group, int course, Map<String, Integer> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    /**
     * to complete it
     */
    public static void createStudents() {
        Map<String, Integer> marks1 = new HashMap<>(), marks2 = new HashMap<>(), marks3 = new HashMap<>();
        marks1.put("Math", 1);
        marks1.put("Phys", 2);
        marks1.put("Programming", 3);
        students.add(new Student("Adam", "A1", 1, marks1));

    }

    public static void printStudents(List students, int course) {
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            Student s = studentIterator.next();
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }

    public static void checkForAverage() {
        for (Student s : students) {
            if (s.average() >= 3) {
                System.out.println(s.getName() + " go to the next course");
            } else {
                System.out.println(s.getName() + " deducted");
            }
        }
    }

    public static void main(String[] args) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public int average() {
        int a = 0;
        for (Integer m : marks.values()) {
            a += m;
        }
        return a / marks.size();
    }
}
