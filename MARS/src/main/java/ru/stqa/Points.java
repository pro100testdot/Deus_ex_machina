package ru.stqa;

public class Points {
    public static void main(String[] args) {

        BasePoint b = new BasePoint(3, 3, 6, 6);
        System.out.println("Растояние между точками a " + "(x = " + b.x1 + " / y = " + b.y1 + ")" + " и b " + "(x = " + b.x1 + " / y = " + b.y1 + ") = " + b.distance());
    }
}


