import java.util.Scanner;
class Student {
    int id;
    float marks;

    void display() {
        System.out.println("Your id: "+id);
        System.out.println("Mark is: "+marks );
    }
}
public class single {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        System.out.print("Enter Your Id: ");
        st.id = sc.nextInt();
        System.out.print("Enter Your Mark: ");
        st.marks = sc.nextFloat();

        st.display();
    }
}
