import java.util.Scanner;
class Student {
    int id;
    float marks;
    void display() {
        System.out.println("Your id is: "+id);
        System.out.println("Your mark is: "+marks);
    }
}
public class multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.print("Enter your id:");
        s1.id = sc.nextInt();
        System.out.print("Enter your mark:");
        s1.marks = sc.nextFloat();
        System.out.print("Enter your id:");
        s2.id = sc.nextInt();
        System.out.print("Enter your mark:");
        s2.marks = sc.nextFloat();
        s1.display();
        s2.display();
    }
}
