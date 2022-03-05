package Java;

import java.util.Scanner;

public class prg24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, n = 0, r = 0, s = 0, num = 0;

        do {
            System.out.println();
            System.out.println("1.Check For Positive or Negative Number");
            System.out.println("2.Check For Odd or Even Number");
            System.out.println("3.Check For Prime Number");
            System.out.println("4.Check For Palindrom Number");
            System.out.println("5.Check For Armstrong Number");
            System.out.println("6.Check Whether a member of fibonacii series");
            System.out.println("7.Exit");

            System.out.print("\nEnter Your Choice : ");
            ch = sc.nextInt();
            if (ch >= 1 && ch <= 6) {
                System.out.print("Enter No : ");
                n = sc.nextInt();
                num = n;
            }
            switch (ch) {
                case 1:
                    if (n > 0) {
                        System.out.println(n + " is Positive no");
                    } else if (n < 0) {
                        System.out.println(n + " is Negative no");
                    } else {
                        System.out.println(n + " is Zero");
                    }
                    break;

                case 2:
                    if (n % 2 == 0) {
                        System.out.println(n + " is even no");
                    } else {
                        System.out.println(n + " is odd no");
                    }
                    break;

                case 3:
                    int p = 1;
                    for (int i = 2; i < n; i++) {
                        if (n % i == 0) {
                            p = 0;
                            break;
                        }
                    }
                    if (p == 1) {
                        System.out.println(n + " is prime no");
                    } else {
                        System.out.println(n + " is not prime no");
                    }
                    break;

                case 4:
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
                    break;

                case 5:
                    while (n > 0) {
                        r = n % 10;
                        s = s + (r * r * r);
                        n = n / 10;
                    }

                    if (num == s) {
                        System.out.println(num + " is Armstrong");
                    } else {
                        System.out.println(num + " is not Armstrong");
                    }
                    break;

                case 6:
                    if (n == 0 || n == 1) {
                        System.out.println(num + " is Fibonacii term");
                    } else {
                        int a = 0;
                        int b = 1;
                        int c = a + b;
                        while (c < n) {
                            a = b;
                            b = c;
                            c = a + b;
                        }
                        if (c == n) {
                            System.out.println(num + " is Fibonacii term");
                        } else {
                            System.out.println(n + " Not Fibonacii term");
                        }
                    }
                    break;

                case 7:
                    System.out.println("Thank You...");
                    break;

                default:
                    System.out.println("Please Enter Valid Choice...");
                    break;
            }

        } while (ch != 7);
        sc.close();
    }
}