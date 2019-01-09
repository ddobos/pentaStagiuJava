package homeworkweek3.shape;

import homeworkweek3.Shapes;

public class Triangle extends Shapes {

    private double ac;
    private double bc;
    private double ab;

    public Triangle(double ac, double bc, double ab) {
        this.ac = ac;
        this.bc = bc;
        this.ab = ab;
    }

    @Override
    public double perimeter() {
        return ac + bc + ab;
    }

    @Override
    public double aria() {
        return (ac * ab) / 2;
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}
