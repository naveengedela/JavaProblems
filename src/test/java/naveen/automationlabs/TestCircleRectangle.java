package naveen.automationlabs;

import org.checkerframework.checker.units.qual.C;

public class TestCircleRectangle {
    public static void main(String[] args) {
//        CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);
//        System.out.println("A color is "+ circle.toString());
//        System.out.println("The color is" + circle.getColor());
//        System.out.println("The radius is " + circle.getRadius());
//        System.out.println("The area is "+ circle.getArea());
//        System.out.println("The diameter is "+ circle.getDiameter());
//
//        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2, 4);
//        System.out.println(rectangle.getPerimeter());

        GeometricObject geometricObject1 = new CircleFromSimpleGeometricObject(5);
        GeometricObject geometricObject2 = new RectangleFromSimpleGeometricObject(5, 3);
        System.out.println(equalArea(geometricObject1, geometricObject2));



    }

    public static boolean equalArea(GeometricObject object1, GeometricObject object2){
        return object1.getArea() == object2.getArea();
    }
}
