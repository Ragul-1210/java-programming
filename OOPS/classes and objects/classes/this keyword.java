
import java.util.*;


class customer{
    int id;
    String name;
    String location;

    customer(){
        this.id=id;
        this.name=name;
        this.location=location;
    }

    void display(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Location: "+location);
    }

}

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        customer cust=new customer();
        cust.id=sc.nextInt();
        cust.name=sc.next();
        cust.location=sc.next();
        cust.display();
    }
}
