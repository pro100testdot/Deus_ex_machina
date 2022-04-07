package ru.stqa;

public class ProDistance {
    public double xa;
    public double ya;
    public double xb;
    public double yb;

    public Point p1 (double xa, double ya) {

        this.xa = xa;
        this.ya = ya;
    }

    public Point p2 (double xb, double yb) {
        this.xb = xb;
        this.yb = yb;
    }

    public double distance(Point p1, Point p2){
        double d = Math.sqrt((p2.ya - p1.xa) * (p2.ya - p1.xa) + (p2.yb - p1.xb) * (p2.yb * p1.xb));
        return d;
    }
}
