package ru.stqa;

public class CheckPoint {
    public double x1, y1, x2, y2;

    public static void main(String[] args) {
        CheckPoint p1 = new CheckPoint();
        p1.x1 = 2;
        p1.y1 = 2;
        CheckPoint p2 = new CheckPoint();
        p1.x2 = 6;
        p1.y2 = 6;
        System.out.println("Расстояние между точками A и B" + " = " + distance(p1, p2));
    }

    public static double distance(CheckPoint p1, CheckPoint p2) {
        return Math.sqrt((p2.x2 - p1.x1) * (p2.x2 - p1.x1) + (p2.y2 - p1.y1) * (p2.y2 - p1.y1));
    }
}




