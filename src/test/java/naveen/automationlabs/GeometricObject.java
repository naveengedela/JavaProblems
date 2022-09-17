package naveen.automationlabs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    // the constructor is abstract class is defined because it is used by subclasses. when you create a instance of concrete classes, it's superclasses a construcor is invoked
    // to initilize data fields defined in superclass
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor " + color + " and filled ";
    }
}
