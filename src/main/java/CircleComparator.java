public class CircleComparator implements Comparator{
    @Override
    public boolean compare(Circle c1, Circle c2) {
        boolean a = false;
        if (c1.getRadius() > c2.getRadius()) {a = true;}
        else a= false;
        return a;
    }
}
