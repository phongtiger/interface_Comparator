import java.util.Arrays;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle(1);
        circles[2] = new Circle(7,"red",false);

        System.out.println("Pre-sorted:");
        for (Circle circle1:circles) {
            System.out.println(circle1);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle:circles) {
            System.out.println(circle);
        }
    }
}
