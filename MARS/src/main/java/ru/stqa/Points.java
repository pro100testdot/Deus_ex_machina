package ru.stqa;

public class Points {
    public static void main(String[] args) {

        BasePoint B = new BasePoint(3, 3, 6, 6);
        System.out.println("points distance =" + distance(B));
    }
    public static double distance (BasePoint P){
        return Math.sqrt((P.x2 - P.x1) * (P.x2 - P.x1) + (P.y2 - P.y1) * (P.y2 - P.y1));
    }
}

