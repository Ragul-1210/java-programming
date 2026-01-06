import java.util.Scanner;
class Student {
    public int id;          
    protected float marks;  
    int age;                
    private String name;    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = sc.nextInt();
        System.out.print("Enter marks: ");
        marks = sc.nextFloat();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Marks: " + marks);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }
}
public class accessspecifier {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();  
        s.display();  
    }
}
