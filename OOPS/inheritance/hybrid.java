// hybrid inheritance
import java.util.Scanner;
interface A {
    void a(String aname);
}
class B {
    void b(String bname) {
        System.out.println("Class B name: " + bname);
    }
}
class C extends B implements A {
    public void a(String aname) {
        System.out.println("Interface A name: " + aname);
    }
    void c(String cname) {
        System.out.println("Class C name: " + cname);
    }
}
public class hybrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Interface A name: ");
        String a = sc.nextLine();
        System.out.print("Enter Class B name: ");
        String b = sc.nextLine();
        System.out.print("Enter Class C name: ");
        String c = sc.nextLine();
        C obj = new C();
        obj.a(a);
        obj.b(b);
        obj.c(c);
    }
}
