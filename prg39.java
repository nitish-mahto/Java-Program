package Lab_Work;

public class prg39 {
    public static void main(String[] args) {
        int cp = 0, cn = 0;
/* 
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        
        if (n1 > n2 && n1 > n3) {
        System.out.println(n1 + " is max");
        } else if (n2 > n3) {
        System.out.println(n2 + " is max");
        } else {
        System.out.println(n3 + " is max");
        }
        
        if (n1 < n2 && n1 < n3) {
        System.out.println(n1 + " is min");
        } else if (n2 < n3) {
        System.out.println(n2 + " is min");
        } else {
        System.err.println(n3 + " is min");
        }

        System.out.println("Sum is : " + (n1 + n2 + n3));
        System.out.println("Average is : " + ((n1 + n2 + n3) / 3));
        
        if (n1 > 0) {
        cp++;
        }
        if (n2 > 0) {
        cp++;
        }
        if (n3 > 0) {
        cp++;
        }
        
        if (n1 < 0) {
        cn++;
        }
        if (n2 < 0) {
        cn++;
        }
        if (n3 < 0) {
        cn++;
        }
        
        System.out.println("Total Positive no is : " + cp);
        System.out.println("Total Negative no is : " + cn);
 */
        

        int n[] = new int[5];
        int max = 0;
        int min = 0;
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < 5; i++) {
            n[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < 5; i++) {
            if (n[i] > max) {
                max = n[i];
            }else{
                min = n[i];
            }

            if(n[i]>0){
                cp++;
            }else{
                cn++;
            }
            sum +=n[i];
        }

        avg = sum / 5.0;
        System.out.println("Max is : " + max);
        System.out.println("Max is : " + min);
        System.out.println("Sum is : " + sum);
        System.out.println("Average is : " + avg);
        System.out.println("Total Positive Numbers are : " + cp);
        System.out.println("Total Negative Numbers are : " + cn);

    }
}
