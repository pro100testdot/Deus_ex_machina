package ru.stqa;

public class Points {
    public static void main(String[] args) {

        Pointsdata P = new Pointsdata(2, 2, 6, 6);
        System.out.println("points distance =" + distance(P));
    }
    public static double distance (Pointsdata P){
        return Math.sqrt((P.x2 - P.x1) * (P.x2 - P.x1) + (P.y2 - P.y1) * (P.y2 - P.y1));
    }
}

