package Java;

import java.util.Scanner;

public class prg12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + ",\t");
        }

        sc.close();
    }
}
