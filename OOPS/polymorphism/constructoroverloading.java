import java.util.Scanner;
class Addition {
    Addition(int a, int b) {
        System.out.println("Sum of two intergers: " + (a + b));
    }
    Addition(int a, double b) {
        System.out.println("Sum of one integer and one double: " + (a + b));
    }
    Addition(double a, int b) {
        System.out.println("Sum of one double and one integer: " + (a + b));
    }
    Addition(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }
}
public class constructoroverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        new Addition(a, b);
        System.out.println("Enter an integer and a double:");
        int c = sc.nextInt();
        double d = sc.nextDouble();
        new Addition(c, d);
        System.out.println("Enter a double and an integer:");
        double e = sc.nextDouble();
        int f = sc.nextInt();
        new Addition(e, f);
        System.out.println("Enter three integers:");
        int g = sc.nextInt();
        int h = sc.nextInt();
        int i = sc.nextInt();
        new Addition(g, h, i);
        sc.close();
    }
}