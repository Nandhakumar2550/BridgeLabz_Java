package inheritance;

// Base class representing a general animal
public class Animal {

    // Name of the animal
    String name;

    // Age of the animal
    int age;

    void makeSound() {

        // Default sound for generic animal
        System.out.println("Animal makes sound");
    }
}

// Dog class inheriting from Animal
class Dog extends Animal {

    // Overriding makeSound method
    void makeSound() {

        // Specific behavior for Dog
        System.out.println("Dog barks");
    }
}

// Cat class inheriting from Animal
class Cat extends Animal {

    // Overriding makeSound method
    void makeSound() {

        // Specific behavior for Cat
        System.out.println("Cat meows");
    }
}

// Bird class inheriting from Animal
class Bird extends Animal {

    // Overriding makeSound method
    void makeSound() {

        // Specific behavior for Bird
        System.out.println("Bird chirps");
    }
}

// Main class
class TestAnimal {

    public static void main(String[] args) {

        // Polymorphism: parent reference, child objects
        Animal a1 = new Dog();

        Animal a2 = new Cat();

        Animal a3 = new Bird();

        // Dynamic method dispatch (runtime polymorphism)
        a1.makeSound();

        a2.makeSound();

        a3.makeSound();
    }
}