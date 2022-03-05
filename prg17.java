package Java;

import java.util.Scanner;

public class prg17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Starting No :");
        int n1 = sc.nextInt();
        System.out.print("Enter Ending No :");
        int n2 = sc.nextInt();

        if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                int p = 1;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        p = 0;
                        break;
                    }
                }
                if (p == 1) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("The Ending number cannot be grater than the staring number...");
        }

        sc.close();
    }
}
