package ru.stqa;

public class ProGeometria {
    public static void main(String[] args) {

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стророной " + s.l + " = " +s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами "+r.a+" и "+r.b+" = " + r.area());

    }
}
