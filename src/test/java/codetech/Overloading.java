package codetech;

//Why is method overloading not possible just by changing the return type?
public class Overloading {
    public double add(int a, int b){
        return a +b;
    }

    public double add(double a, double b){
        return a +b;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        String overloading = Overloading.class.getName();
        Class<?> clas = Class.forName(overloading);
    }
}
