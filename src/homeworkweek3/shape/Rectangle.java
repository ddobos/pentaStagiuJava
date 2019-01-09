package homeworkweek3.shape;

import homeworkweek3.Shapes;

public class Rectangle extends Shapes {

    private double width;
    private double heigth;

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double perimeter() {
        return 2 * (width + heigth);
    }

    @Override
    public double aria() {
        return width * heigth;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
