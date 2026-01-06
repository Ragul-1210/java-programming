import java.util.Scanner;
class Student {
    private int id;
    private float marks;
    private String name;
    Student(int id, float marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public float getMarks() {
        return marks;
    }
    public String getName() {
        return name;
    }
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
public class constru {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        float marks = sc.nextFloat();
        Student s = new Student(id, marks, name);
        s.display();
    }
}