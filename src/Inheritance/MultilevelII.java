package Inheritance;

class Animall {
    String name;

    public void eat() {
        System.out.println("Eating something.....");
    }

}
class Mammal extends Animall{
    public void walk() {
        System.out.println("walking......");
    }
}

class Dog extends Mammal {
    public void bark() {
        System.out.println("Dog barking......");
    }
}

    public class MultilevelII {
        public static void main(String[] args) {
            Dog myDog = new Dog();
            myDog.name = "Buddy";
            System.out.println("Method of current class:");
            myDog.bark();
            System.out.println("Method of parent class:");
            myDog.walk();
            System.out.println("Method of grand parent class:");
            myDog.eat();
        }
    }

