package homeworkweek3;

import homeworkweek3.shape.Circle;
import homeworkweek3.shape.Rectangle;
import homeworkweek3.shape.Square;
import homeworkweek3.shape.Triangle;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rect = new Rectangle(4, 2);
        Square sq = new Square(4);
        Triangle tri = new Triangle(3, 3, 3);
        List<Shapes> list = new ArrayList<>();
        list.add(circle);
        list.add(rect);
        list.add(sq);
        list.add(tri);
        Collections.sort(list, new Comparator<Shapes>() {
            @Override
            public int compare(Shapes o1, Shapes o2) {
                return (int)(o2.aria() - o1.aria());
            }
        });
        System.out.println(list.get(0).toString());
    }
}
