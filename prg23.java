package Java;

import java.util.Scanner;

public class prg23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many no do you want? : ");
        int n = sc.nextInt();

        int num[] = new int[n];
        int s = 0;
        int pn = 0;
        int nn = 0;
        int max = 0;
        int min = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter no" + (i + 1) + " : ");
            num[i] = sc.nextInt();
        }

        for (int i = 1; i < num.length; i++) {
            for (int j = i; j > 0; j--) {
                if (num[j] < num[j - 1]) {
                    int temp = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = temp;
                }
            }
        }

        System.out.println("Sorted");
        System.out.println("===========");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            s = s + num[i];
            if (num[i] > 0) {
                pn++;
            } else {
                nn++;
            }

            if (num[i] > max) {
                max = num[i];
            } else if (num[i] < min) {
                min = num[i];
            }
        }
        float avg = (float) s / n;
        System.out.println("===================================");
        System.out.println("The Sum : " + s);
        System.out.println("The Average : " + avg);
        System.out.println("Total Positive numbers are : " + pn);
        System.out.println("Total Negative numbers are : " + nn);
        System.out.println("Maximum no is : " + max);
        System.out.println("Minimum no is : " + min);
        System.out.println("===================================");
        sc.close();
    }
}