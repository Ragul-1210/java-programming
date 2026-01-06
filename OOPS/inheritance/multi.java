//multiple inheritance
import java.util.Scanner;
interface Parent1 {
    void p1(String name1);
}
interface Parent2 {
    void p2(String name2);
}
class Child implements Parent1, Parent2 {
    public void p1(String name1) {
        System.out.println("Parent1 name: " + name1);
    }
    public void p2(String name2) {
        System.out.println("Parent2 name: " + name2);
    }
}
public class multi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Parent1 name: ");
        String p1 = sc.nextLine();
        System.out.print("Enter Parent2 name: ");
        String p2 = sc.nextLine();
        Child c = new Child();
        c.p1(p1);
        c.p2(p2);
    }
}

