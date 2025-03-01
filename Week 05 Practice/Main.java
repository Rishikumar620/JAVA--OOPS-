//Create a three-level inheritance hierarchy with classes like Animal, Mammal, and Dog. Add attributes and methods to demonstrate multilevel inheritance.

class Animal {
    String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void eat() {
        System.out.println(name + " is eating.");
    }
}
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void bark() {
        System.out.println(name + " is barking!");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Chiku");
        
        dog.eat();  
        dog.bark(); 
    }
}



