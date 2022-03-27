package Lab_Work;

import java.util.Scanner;

/**
 * prg34
 */
public class prg34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, r1 = 0, c1 = 0, r = 0, s = 0, num = 0;

        do {
            System.out.println();
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("\nEnter Your Choice : ");
            ch = sc.nextInt();
            if (ch >= 1 && ch <= 4) {
                System.out.print("Enter Number of Rows : ");
                r1 = sc.nextInt();
                System.out.print("Enter Number of Column : ");
                c1 = sc.nextInt();

                int num1[][] = new int[r1][c1];
                int num2[][] = new int[r1][c1];
                int num3[][] = new int[r1][c1];

                System.out.println("First Matrix");
                System.out.println("=================");
                for (int i = 0; i < num1.length; i++) {
                    for (int j = 0; j < num1[0].length; j++) {
                        System.out.print("Enter Element [ " + i + " ][ " + j + " ] : ");
                        num1[i][j] = sc.nextInt();
                    }
                    System.out.println();
                }

                System.out.println("Second Matrix");
                System.out.println("=================");
                for (int i = 0; i < num2.length; i++) {
                    for (int j = 0; j < num2[0].length; j++) {
                        System.out.print("Enter Element [ " + i + " ][ " + j + " ] : ");
                        num2[i][j] = sc.nextInt();
                    }
                    System.out.println();
                }
            }
            switch (ch) {
                case 1:
                    System.out.println("First Matrix");
                    System.out.println("=================");
                    System.out.println("Matrix");
                    for (int i = 0; i < num1.length; i++) {
                        for (int j = 0; j < num1[0].length; j++) {
                            System.out.print(num1[i][j] + " ");
                        }
                        System.out.println();
                    }

                    System.out.println("\nSecond Matrix");
                    System.out.println("=================");

                    for (int i = 0; i < num2.length; i++) {
                        for (int j = 0; j < num2[0].length; j++) {
                            System.out.print(num2[i][j] + " ");
                        }
                        System.out.println();
                    }

                    System.out.println("\nAddition");
                    System.out.println("=================");
                    for (int i = 0; i < num2.length; i++) {
                        for (int j = 0; j < num2[0].length; j++) {
                            num3[i][j] = num1[i][j] + num2[i][j];
                            System.out.print(num3[i][j] + "\t");
                        }
                        System.out.println();
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