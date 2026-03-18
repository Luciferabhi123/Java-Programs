/*package Inheritance method (to call a class functions to another class);*/

class Animal {
    void eat() {
        System.out.println("I can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("I can bark");
    }
}

public class Inheritance_Method {
    public static void main(String[] args) {
        // Creating an object of the subclass
        Dog dog = new Dog();

        // Calling the inherited method from the superclass
        dog.eat();

        // Calling the method from the subclass
        dog.bark();
    }
}
