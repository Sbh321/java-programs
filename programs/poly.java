class Animal {
    void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat is meowing.");
    }
}

public class poly {
    public static void main(String[] args) {
        Dog animal1 = new Dog();
        Cat animal2 = new Cat();
        
        animal1.makeSound(); // Output: "Dog is barking."
        animal2.makeSound(); // Output: "Cat is meowing."
    }
}
