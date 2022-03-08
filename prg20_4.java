package Java;

import java.util.Scanner;

public class prg20_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no :");
        int n = sc.nextInt();

        /*
         * for (int i = 1; i <= n; i++) {
         * for (int j = 1; j <= i; j++) {
         * System.out.print(j + "*".repeat(j));
         * }
         * System.out.println();
         * }
         */

        /*
         * In Case if repeat method (function) not work then we have to use below
         * loop...
         */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                for (int k = 1; k <= j; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
