package codetech;

// Runtime polymorphism(dynamic method binding) is achieved by method overriding in java. based on object the method will be call on run time.
public class RunTimePoly {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.shout();
        Animal dog = new Dog();
        dog.shout();
        Animal puppy = new Puppy();
        puppy.shout();
    }



}
