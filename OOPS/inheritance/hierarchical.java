// hierarchical inheritance
import java.util.Scanner;
class Parent {
    void pprop(String pname) {
        System.out.println("Parent name: " + pname);
    }
}
class Child1 extends Parent {
    void c1prop(String name) {
        System.out.println("Child1 name: " + name);
    }
}
class Child2 extends Parent {
    void c2prop(String name) {
        System.out.println("Child2 name: " + name);
    }
}
public class hierarchical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Parent name: ");
        String p = sc.nextLine();
        System.out.print("Enter Child1 name: ");
        String c1 = sc.nextLine();
        System.out.print("Enter Child2 name: ");
        String c2 = sc.nextLine();
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();
        obj1.pprop(p);
        obj1.c1prop(c1);
        obj2.pprop(p);
        obj2.c2prop(c2);
    }
}
