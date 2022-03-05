package Java;

import java.util.Scanner;

public class prg16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int r = 0;
        System.out.print("Enter No :");
        int n = sc.nextInt();
        int num = n;

        while (n > 0) {
            r = n % 10;
            s = (s * 10) + r;
            n = n / 10;
        }

        if (num == s) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is not Palindrome");
        }

        sc.close();
    }
}
