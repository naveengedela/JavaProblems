package y.Daniel.Liang;

import org.checkerframework.checker.units.qual.C;

public class TestCircleWithPrivateDataFields {
    public static void main(String[] args) {
        CircleWithPrivateDataFields circleWithPrivateDataFields = new CircleWithPrivateDataFields(5.0);
        printCircle(circleWithPrivateDataFields);
    }

    public static void printCircle(CircleWithPrivateDataFields c){
        System.out.println("The area of the circle of radius " + c.getRadius());
    }
}
