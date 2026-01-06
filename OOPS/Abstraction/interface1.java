import java.util.Scanner;
interface Student {
    void getData();    
    void display();    
}
class GraduateStudent implements Student {
    int id;
    String name;
    float marks;
    Scanner sc = new Scanner(System.in);
    public void getData() {
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextFloat();
    }
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
public class interface1 {
    public static void main(String[] args) {
        Student s = new GraduateStudent();
        s.getData();
        s.display();
    }
}