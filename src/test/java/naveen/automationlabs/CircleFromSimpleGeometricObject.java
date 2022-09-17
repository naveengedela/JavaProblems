package naveen.automationlabs;

public class CircleFromSimpleGeometricObject extends GeometricObject{
    private double radius;

    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(){}

    public CircleFromSimpleGeometricObject(String color, boolean filled, double radius) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Created on " + getDateCreated() + "and radius is "+ radius;
    }
}
