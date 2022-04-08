package ru.stqa;

public class Pro2tck {
    public double x1, y1, x2, y2;

    public static void main(String[] args) {
        Pro2tck p1 = new Pro2tck();
        p1.x1 = 2;
        p1.y1 = 2;
        Pro2tck p2 = new Pro2tck();
        p2.x2 = 6;
        p2.y2 = 6;
        System.out.println("Расстояние между точками A" + 2 + "и B" + "=" + distance(p1, p2));
    }

    public static double distance(Pro2tck p1, Pro2tck p2) {
        return Math.sqrt((p2.x2 - p1.x1) * (p2.x2 - p1.x1) + (p2.y2 - p1.y1) * (p2.y2 - p1.y1));
    }
}




