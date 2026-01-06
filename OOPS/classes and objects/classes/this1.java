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
public class this1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        Addition obj = new Addition(a, b);
        obj.add();
    }
}
