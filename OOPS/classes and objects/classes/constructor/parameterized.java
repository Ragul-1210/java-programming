import java.util.Scanner;
class Student {
    int id;
    float marks;
    Student(int id, float marks) {
        this.id = id;
        this.marks = marks;
    }
    void display() {
        System.out.println(id + " " + marks);
    }
}
public class parameterized{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        System.out.print("Enter marks: ");
        float marks = sc.nextFloat();
        Student s1 = new Student(id, marks);
        s1.display();
    }
}
