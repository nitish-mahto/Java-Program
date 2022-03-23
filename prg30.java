package Lab_Work;

import java.util.Scanner;

class MathOp {

    void add(double x, double y) {
        System.out.println("Addition of " + x + " and " + y + " is : " + (x + y));
    }

    void sub(double x, double y) {
        System.out.println("Subtraction of " + x + " and " + y + " is : " + (x - y));
    }

    void mul(double x, double y) {
        System.out.println("Multiplication of " + x + " and " + y + " is : " + (x * y));
    }

    void div(double x, double y) {
        if (y == 0) {
            System.out.println("Number cannot divide by zero");
        } else {
            System.out.println("Division of " + x + " and " + y + " is : " + (x / y));
        }
    }

}

public class prg30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no1 : ");
        double n1 = sc.nextDouble();
        System.out.print("Enter no2 : ");
        double n2 = sc.nextDouble();
        System.out.print("Enter Operator(+,-,*,/) : ");
        char opr = sc.next().charAt(0);
        MathOp ob = new MathOp();
        if (opr == '+' || opr == '-' || opr == '*' || opr == '/') {
            if (opr == '+') {
                ob.add(n1, n2);
            } else if (opr == '-') {
                ob.sub(n1, n2);
            } else if (opr == '*') {
                ob.mul(n1, n2);
            } else if (opr == '/') {
                ob.div(n1, n2);
            }
        } else {
            System.out.println("Please Enter Operator Only +, -, *, /");
        }
        sc.close();
    }
}
