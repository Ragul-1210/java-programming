import java.util.Scanner;
class Student {
    int id;
    float marks;
    void setData(int id, float marks) {
        this.id = id;
        this.marks = marks;
    }
    void display() {
        System.out.println("Your id is: "+id);
        System.out.println("Your mark is: "+marks);
    }
}
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.print("Enter Your id: ");
            int id = sc.nextInt();
            System.out.print("Enter Your mark: ");
            float marks = sc.nextFloat();
            students[i].setData(id, marks);
        }
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}
