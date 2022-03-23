package Lab_Work;

import java.util.Scanner;

class circle {
    double r;

    void setRadius(Double radius) { // Using setRadius Method....
        r = radius;
    }

    /*
     * circle(float radius){ //Using Constructor....s
     * r = radius;
     * }
     */
    double area() {
        return Math.PI * r * r;
    }

    double circumference() {
        return Math.PI * r * 2;
    }

}

public class prg27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        double r = sc.nextDouble();

        /*
         * circle ob = new circle(r); //Use When Constructor Define...
         * System.out.println("Area of Circle is : " + ob.area());
         */

        circle ob = new circle(); // Use When setRadius methon is Define...
        ob.setRadius(r);
        // double ans = ob.area();
        
        System.out.println("Area of  Circle is : " + ob.area());
        System.out.println("Circumference of Circle is : "+ob.circumference());

        sc.close();
    }
}
