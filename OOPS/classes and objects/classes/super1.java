import java.util.Scanner;
class Addition {
    int a, b;
    Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void add() {
        System.out.println("Addition = " + (a + b));
    }
}
class Subtraction extends Addition {
    Subtraction(int a, int b) {
        super(a, b);
    }
    void sub() {
        System.out.println("Subtraction = " + (a - b));
    }
}
public class super1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        Subtraction obj = new Subtraction(a, b);
        obj.add();
        obj.sub();
    }
}
