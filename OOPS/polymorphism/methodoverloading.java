import java.util.Scanner;
class Addition {
    void add(int a, int b) {
        System.out.println("Sum of two intergers: " + (a + b));
    }
    void add(int a, double b) {
        System.out.println("Sum of one integer and one double: " + (a + b));
    }
    void add(double a, int b) {
        System.out.println("Sum of one double and one interger: " + (a + b));
    }
    void add(int a, int b, int c) {
        System.out.println("Sum of three intergers: " + (a + b + c));
    }
}
public class methodoverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Addition obj = new Addition();
        System.out.println("Enter two integers:");
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();
        obj.add(int1, int2);
        System.out.println("Enter an integer and a double:");
        int int3 = sc.nextInt();
        double double1 = sc.nextDouble();
        obj.add(int3, double1);
        System.out.println("Enter a double and an integer:");
        double double2 = sc.nextDouble();
        int int4 = sc.nextInt();
        obj.add(double2, int4);
        System.out.println("Enter three integers:");
        int int5 = sc.nextInt();
        int int6 = sc.nextInt();
        int int7 = sc.nextInt();
        obj.add(int5, int6, int7);
        sc.close();
    }
}