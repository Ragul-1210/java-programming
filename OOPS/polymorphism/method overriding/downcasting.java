// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void breed() {
        System.out.println("Dog breed is Labrador");
    }
}
public class downcasting {
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = (Dog) a;
        d.sound();
        d.breed(); 
    }
}