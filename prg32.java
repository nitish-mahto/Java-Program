package Lab_Work;

import java.util.Scanner;

class MathFun {
    void odev(int x) {
        if (x % 2 == 0) {
            System.out.println(x + " is Even no");
        } else {
            System.out.println(x + " is Odd no");
        }
    }

    void prime(int x) {
        int p = 1;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                p = 0;
                break;
            }
        }
        if (p == 1) {
            System.out.println(x + " is Prime no");
        } else {
            System.out.println(x + " is not Prime no");
        }
    }

    int r = 0, s = 0;

    void pali(int x) {

        int num = x;
        while (x > 0) {
            r = x % 10;
            s = (s * 10) + r;
            x = x / 10;
        }

        if (num == s) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is not Palindrome");
        }
    }

    void arm(int x) {
        int num = x;
        while (x > 0) {

            r = x % 10;
            s = s + (r * r * r);
            x = x / 10;
        }

        if (num == s) {
            System.out.println(num + " is Armstrong");
        } else {
            System.out.println(num + " is not Armstrong");
        }
    }
}

public class prg32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathFun ob = new MathFun();
        int ch, n = 0;
        do {
            System.out.println("1. Check number is Odd or Even");
            System.out.println("2. Check number is Prime or Not");
            System.out.println("3. Check number is Palindrome or Not");
            System.out.println("4. Check number is Amstrong or Not");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice : ");
            ch = sc.nextInt();

            if (ch >= 1 && ch <= 4) {
                System.out.print("Enter number : ");
                n = sc.nextInt();
            }
            switch (ch) {
                case 1:
                    ob.odev(n);
                    break;

                case 2:
                    ob.prime(n);
                    break;

                case 3:
                    ob.pali(n);
                    break;

                case 4:
                    ob.arm(n);
                    break;
                case 5:
                    System.out.println("Thankyou!");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (ch != 5);
        sc.close();
    }
}
