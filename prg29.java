package Lab_Work;

import java.util.Scanner;

class rectangle1 {
    double l, b;

    rectangle1(double length, double breadth) {
        l = length;
        b = breadth;
    }

    void perimeter() {
        System.out.println("Perimeter of Rectangle is : " + (2 * (l * b)));
    }

    void area() {
        System.out.println("Area of Rectangle is : " + (l * b));
    }

}

class square1 {
    double l;

    square1(double length) {
        l = length;
    }

    void perimeter() {
        System.out.println("Perimeter of Square is : " + (4 * l));
    }

    void area() {
        System.out.println("Area of Square is : " + (l * l));
    }
}

class triangle1 {
    double l,b,h;

    triangle1(double length, double base, double hypotenuse) {
        l = length;
        b = base;
        h = hypotenuse;
    }

    void perimeter() {
        System.out.println("Perimeter of Triangle is : " + (l+b+h));
    }

    void area() {
        System.out.println("Area of Triangle is : " + (0.5*l * b));
    }
}

public class prg29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length : ");
        double l = sc.nextDouble();
        System.out.print("Enter Breadth(Base) : ");
        double b = sc.nextDouble();
        System.out.print("Enter Hypotenuse : ");
        double h = sc.nextDouble();

        rectangle1 ob = new rectangle1(l, b);
        ob.area();
        ob.perimeter();

        square1 ob1 = new square1(l);
        ob1.area();
        ob1.perimeter();

        triangle1 ob2 = new triangle1(l,b,h);
        ob2.area();
        ob2.perimeter();

        sc.close();
    }
}
