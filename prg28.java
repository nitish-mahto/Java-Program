package Lab_Work;

import java.util.Scanner;

class Sphere {
    double r;

    Sphere() {
        r = 100;
    }

    Sphere(double radius) {
        r = radius;
    }

    void area() {
        double area = 10 * r;
        System.out.println("Area of Sphere is : " + area);
    }
}

public class prg28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        double r = sc.nextDouble();

        Sphere ob = new Sphere();
        ob.area();

        Sphere ob1 = new Sphere(r);
        ob1.area();
        sc.close();
    }
}
