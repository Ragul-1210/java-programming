import java.util.Scanner;
class Student {
    private int id;
    private String name;
    private float marks;
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(float marks) {
        this.marks = marks;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public float getMarks() {
        return marks;
    }
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
public class getterandsetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.print("Enter ID: ");
        s.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Name: ");
        s.setName(sc.nextLine());
        System.out.print("Enter Marks: ");
        s.setMarks(sc.nextFloat());
        s.display();
    }
}