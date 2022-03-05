package Java;

import java.util.Scanner;

public class prg22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        System.out.print("Enter Searching Word : ");
        String word = sc.nextLine();

        String a[] = str.split(" ");

        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i])) {
                count++;
            }
        }

        System.out.println("Total No of Word Occurrencs : " + count);
        sc.close();
    }
}
