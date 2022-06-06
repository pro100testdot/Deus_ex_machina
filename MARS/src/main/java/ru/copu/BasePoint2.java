package ru.copu;

public class BasePoint2 {
    private final double x;
    private final double y;

    public BasePoint2(double x1, double y1) {

        this.x = x1;
        this.y = y1;

    }

    public double distance(BasePoint2 p1) {
        return Math.sqrt((p1.x - this.x) * (p1.x - this.x) + (p1.y - this.y) * (p1.y - this.y));
    }
}

