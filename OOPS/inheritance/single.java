// single inheritance
import java.util.Scanner;
class Parent {
    void pprop(String pname) {
        System.out.println("Parent name: " + pname);
    }
}
class Child extends Parent {
    void cprop(String cname) {
        System.out.println("Child name: " + cname);
    }
}
public class single {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Parent name: ");
        String parentName = sc.nextLine();
        System.out.print("Enter Child name: ");
        String childName = sc.nextLine();
        Child c = new Child();
        c.pprop(parentName);  
        c.cprop(childName);   
    }
}