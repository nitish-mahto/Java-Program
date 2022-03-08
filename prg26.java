package Java;

import java.util.Scanner;

/**
 * Square
 */
class Square {
    int l;

    Square() {
        l = 10;
    }

    Square(int length) {
        l = length;
    }

    int display() {
        return l * l;
    }

}

/* Main Class */
public class prg26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length : ");
        int l = sc.nextInt();
        Square ob = new Square(); // Calling default Constructor...
        System.out.println("Square is : " + ob.display());

        Square ob1 = new Square(l); // Using Parameterize Constructor....
        System.out.println("Square is : " + ob1.display());
        sc.close();
    }
}
