import java.util.Scanner;
abstract class Student {
    int id;
    String name;
    abstract void getData();
    abstract void display();
}
class GraduateStudent extends Student {
    float marks;
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextFloat();
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
public class Abstract {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent();
        gs.getData();
        gs.display();
    }
}