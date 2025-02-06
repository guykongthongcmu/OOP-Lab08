package question1;

public class TestComparableCircle {
    public static void main(String[] args) {
        // Create two ComparableCircle objects
        ComparableCircle circle1 = new ComparableCircle(5.0);
        ComparableCircle circle2 = new ComparableCircle(7.0);

        // Compare the two circles
        if (circle1.compareTo(circle2) > 0) {
            System.out.println(circle1);
        } else if (circle1.compareTo(circle2) < 0) {
            System.out.println(circle2);
        } else {
            System.out.println("Both circles have the same radius");
        }
    }
}

class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle other) {
        if (this.getRadius() > other.getRadius()) {
            return 1;
        } else if (this.getRadius() < other.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "The max circle radius is : " + getRadius();
    }
}

