package Java;

import java.util.Scanner;

public class prg3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No1 :");
        int n1 = sc.nextInt();
        System.out.print("Enter No2 :");
        int n2 = sc.nextInt();
        System.out.print("Enter No3 :");
        int n3 = sc.nextInt();

        System.out.println("==================");
        System.out.println("Maximum Number");
        System.out.println("==================");
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is max");
        } else if (n2 > n3) {
            System.out.println(n2 + " is max");
        } else {
            System.out.println(n3 + " is max");
        }
        System.out.println();
        System.out.println("==================");
        System.out.println("Mani1mum Number");
        System.out.println("==================");
        if (n1 < n2 && n1 < n3) {
            System.out.println(n1 + " is min");
        } else if (n2 < n3) {
            System.out.println(n2 + " is min");
        } else {
            System.out.println(n3 + " is min");
        }

        System.out.println("==================");
        sc.close();
    }
}
