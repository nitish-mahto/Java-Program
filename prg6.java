package Java;

import java.util.Scanner;

public class prg6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celsius :");
        int c = sc.nextInt();

        // float f = (float) ((c * 1.8) + 32);
        float f = (float) ((c * 9) / 5 + 32);

        System.out.println("Fahrenheit : " + f);
        sc.close();
    }
}
