// multilevel inheritance
import java.util.Scanner;
class GrandParent {
    void gprop(String gname) {
        System.out.println("Grandparent name: " + gname);
    }
}
class Parent extends GrandParent {
    void pprop(String pname) {
        System.out.println("Parent name: " + pname);
    }
}
class Child extends Parent {
    void cprop(String cname) {
        System.out.println("Child name: " + cname);
    }
}
public class multilevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Grandparent name: ");
        String g = sc.nextLine();
        System.out.print("Enter Parent name: ");
        String p = sc.nextLine();
        System.out.print("Enter Child name: ");
        String c = sc.nextLine();
        Child obj = new Child();
        obj.gprop(g);
        obj.pprop(p);
        obj.cprop(c);
    }
}
