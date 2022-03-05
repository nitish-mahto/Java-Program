package Java;

import java.util.Scanner;

public class prg11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = 1;
        System.out.print("Enter No :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("The Factorial is : " + f);
        sc.close();
    }
}
