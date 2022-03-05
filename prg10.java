package Java;

import java.util.Scanner;

public class prg10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.print("How No of Series do you want to print? :");
        int n = sc.nextInt();

        System.out.print(a + "\t");
        System.out.print(b + "\t");

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + "\t");
            a = b;
            b = c;
        }

        sc.close();
    }
}
