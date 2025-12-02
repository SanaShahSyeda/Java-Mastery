package Java21.RecordPatterns;


public class Main {
    record PointRecord(int x, int y) {}

    public static void main(String[] args) {

        // Before Java21
        Object obj = new Point(10,20);

        if (obj instanceof Point) {
            Point p = (Point) obj;
            int x = p.getX();
            int y = p.getY();
            System.out.println(x + ", " + y);
        }

        // After java 21 Record patterns
        Object obj2 = new PointRecord(10,20);
        print(obj2);
    }

    static void print(Object obj) {
        switch (obj) {
            case PointRecord(int x, int y) -> System.out.println(x + ", " + y);
            default -> {}
        }
    }
}
