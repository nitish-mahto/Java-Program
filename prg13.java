package Java;

import java.util.Scanner;

public class prg13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        System.out.print("Enter No :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            s = s + (i * i);
        }
        System.out.println("The Sum is : " + s);
        sc.close();
    }
}
