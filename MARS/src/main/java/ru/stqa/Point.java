public class Point {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        p1.xa = -4;
        p1.ya = 10;
        p2.xb = 0;
        p2.xy = 13;
        System.out.println("Расстояние между точками (" + p1.toString() + ") и (" + p2.toString1() + ") = " + distance(d));
    }

    public static double distance(Point p1, Point p2) {

        return Math.sqrt((p2.x2 - p1.x1) * (p2.x2 - p1.x1) + (p2.y2 - p1.y1) * (p2.y2 - p1.y1));
    }

}