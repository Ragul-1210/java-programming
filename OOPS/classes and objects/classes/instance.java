import java.util.Scanner;
class Student {
    int id;
    float marks;
    void setData(int i, float m) {
        id = i;
        marks = m;
    }
    void display() {
        System.out.println("Your id is :"+id);
        System.out.println("Your mark is :"+marks);
    }
}
public class instance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[3];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();
            System.out.print("Enter id and marks for student " + (i + 1)+" : ");
            int id = sc.nextInt();
            System.out.print("Enter id and marks for student " + (i + 1)+" : ");
            float marks = sc.nextFloat();
            s[i].setData(id, marks);
        }
        for (int i = 0; i < s.length; i++) {
            s[i].display();
        }
    }
}
