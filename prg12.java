package Java;

import java.util.Scanner;

public class prg12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No :");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
            // sum = sum + i;
            // or //
            sum += i;
        }
        System.out.println("The Sum is : " + sum);
        sc.close();
    }
}
