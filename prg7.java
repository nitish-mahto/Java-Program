package Java;

import java.util.Scanner;

public class prg7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahrenheit :");
        int f = sc.nextInt();

        float c = (float) ((f - 32) * 5 / 9);

        System.out.println("Celsius : " + c);
        sc.close();
    }
}
