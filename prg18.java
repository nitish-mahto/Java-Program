package Java;

import java.util.Scanner;

public class prg18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows :");
        int r1 = sc.nextInt();
        System.out.print("Enter no of columns :");
        int c1 = sc.nextInt();

        int num1[][] = new int[r1][c1];
        int num2[][] = new int[r1][c1];
        int num3[][] = new int[r1][c1];

        System.out.println("First Maxtrix");
        System.out.println("=================");
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[0].length; j++) {
                System.out.print("Enter Element [ " + i + " ][ " + j + " ] : ");
                num1[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Second Maxtrix");
        System.out.println("=================");
        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num2[0].length; j++) {
                System.out.print("Enter Element [ " + i + " ][ " + j + " ] : ");
                num2[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("First Maxtrix");
        System.out.println("=================");
        System.out.println("Matrix");
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[0].length; j++) {
                System.out.print(num1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSecond Maxtrix");
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

        System.out.println("\nSubtraction");
        System.out.println("=================");
        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num2[0].length; j++) {
                num3[i][j] = num1[i][j] - num2[i][j];
                System.out.print(num3[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMultiplication");
        System.out.println("=================");
        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < num2[0].length; j++) {
                num3[i][j] = num1[i][j] * num2[i][j];
                System.out.print(num3[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
