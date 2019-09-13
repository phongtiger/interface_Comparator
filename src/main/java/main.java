import java.sql.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle[0] = new Circle(3.6);
        circle[1] = new Circle(1);
        circle[2] = new Circle(7,"red",false);

        for (Circle circle1:circle) {
            System.out.println(circle1);
        }
        CircleComparator circleComparator = new CircleComparator();
        for (int i = 0; i < circle.length-1; i++) {
            if (circleComparator.compare(circle[i], circle[i + 1])) {
                Circle tem = circle[i];
                circle [i] = circle[i+1];
                circle[i+1] = tem;
            }
        }
        for (Circle circle1:circle) {
            System.out.println(circle1);
        }
    }
}
