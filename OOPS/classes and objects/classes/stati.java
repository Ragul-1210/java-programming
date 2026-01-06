import java.util.Scanner;
class Student {
    static String college;
    int id;
    float marks;
    static void setCollege(Scanner sc) {
        System.out.print("Enter college name: ");
        college = sc.nextLine();
    }
    void setData(Scanner sc) {
        System.out.print("Enter id: ");
        id = sc.nextInt();
        System.out.print("Enter marks: ");
        marks = sc.nextFloat();
    }
    void display() {
        System.out.println(id + " " + marks + " " + college);
    }
}
public class stati {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student.setCollege(sc);
        Student[] s = new Student[2];
        for (int i = 0; i < s.length; i++) {
            System.out.println("Enter details for student " + (i + 1));
            s[i] = new Student();
            s[i].setData(sc);
        }
        System.out.println("\nStudent Details:");
        for (int i = 0; i < s.length; i++) {
            s[i].display();
        }
    }
}