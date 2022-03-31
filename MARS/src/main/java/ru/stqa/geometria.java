package ru.stqa;

public class geometria {
    public static void main(String[] args) {

        Square s = new Square();
        s.l = 5;
        System.out.println("Площадь квадрата со стророной " + s.l + " = " + area(s));

        Rectangle r = new Rectangle();
        r.a = 5;
        r.b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b +" = "+ area(r));

    }

    public static double area(Square s) {
        return s.l * s.l;
    }

    public static double area(Rectangle r) {
        return r.a * r.b;
    }

}
