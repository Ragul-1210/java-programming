import java.util.Scanner;
class Student {
    int id;
    float marks;
    Student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = sc.nextInt();
        System.out.print("Enter marks: ");
        marks = sc.nextFloat();
    }
    void display() {
        System.out.println(id + " " + marks);
    }
}
public class defaultc {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.display();
        s2.display();
    }
}
