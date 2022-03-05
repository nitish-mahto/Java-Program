package Java;

import java.util.Scanner;

public class prg19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no :");
        int n = sc.nextInt();
    
        int count = 0;
        int s = 0;
        while (n > 0) {
            int r = n % 10;
            if (r % 2 != 0) {
                s = s + r;
                count++;
            }
            n = n / 10;
        }
        System.out.println("The Sum of Odd Digits are : "+s);
        System.out.println("Total of Odd Digits are : "+count);
        sc.close();
    }
}
