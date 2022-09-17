package codetech;

public class Animal {

    public void shout() {
        System.out.println("Aninal shout...");
    }
}

class Dog extends Animal {
    public void shout(){
        System.out.println("shout in dog class..");
    }
}

class Puppy extends Animal {
    public void shout(){
        System.out.println("shout out in puppy");
    }
}
