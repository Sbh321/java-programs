class Animal {
    String name = "Animal";

    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    String name = "Dog";

    void display() {
        System.out.println(super.name); // Accesses the 'name' field from the superclass
        super.eat(); // Calls the 'eat' method from the superclass
    }
}

public class hawa {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.display();
    }
}
