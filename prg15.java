package Java;

import java.util.Scanner;

public class prg15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int r = 0;
        System.out.print("Enter No :");
        int n = sc.nextInt();
        int num = n;

        while (n > 0) {
            r = n % 10;
            s = s + r;
            n = n / 10;
        }

        System.out.println("The Sum of " + num + " is :" + s);
        sc.close();
    }
}
