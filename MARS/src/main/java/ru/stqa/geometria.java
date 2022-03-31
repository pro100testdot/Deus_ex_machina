package ru.stqa;

public class geometria {
    public static void main(String[] args) {

        double l = 5;
        System.out.println("Площадь квадрата со стророной " + l + " = " + area(l));
        double len = 5;

        double a = 5;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b +" = "+ area(a,b));

    }

    public static double area(double l) {
        return l * l;
    }

    public static double area(double a, double b) {
        return a * b;
    }

}
