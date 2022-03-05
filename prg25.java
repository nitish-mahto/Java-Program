package Java;

import java.util.Scanner;

/**
 * rectangle
 */
class rectangle {

    float length, breadth;

    void setvalue(float l, float b) {
        length = l;
        breadth = b;
    }

    float findArea() {
        return length * breadth;
    }

    float findPerimeter() {
        /* return 2 * (length + breadth); */
        /* or */
        float perimeter = 2 * (length + breadth);
        return perimeter;
    }
}

public class prg25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectangle ob = new rectangle();
        System.out.print("Enter Length : ");
        float l = sc.nextFloat();
        System.out.print("Enter Breadth : ");
        float b = sc.nextFloat();

        ob.setvalue(l, b);
        float area = ob.findArea();
        float perimeter = ob.findPerimeter();
        System.out.println("Area of Rectange : " + area);
        System.out.println("Perimeter of Rectange : " + perimeter);
        sc.close();
    }
}
