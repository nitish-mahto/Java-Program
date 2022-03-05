package Java;

import java.util.Scanner;

public class prg14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = 0;
        int s2 = 0;
        System.out.print("Enter Starting No :");
        int n1 = sc.nextInt();
        System.out.print("Enter Ending No :");
        int n2 = sc.nextInt();

        if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                if (i % 2 == 0) {
                    s1 = s1 + i;
                } else {
                    s2 = s2 + i;
                }
            }

            System.out.println("The Sum of Even no is : " + s1);
            System.out.println("The Sum of Odd no is : " + s2);
        } else {
            System.out.println("The Ending number cannot be grater than the staring number...");
        }

        sc.close();
    }
}
