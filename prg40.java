package Lab_Work;

public class prg40 {
    public static void main(String[] args) {
        int n[] = new int[5];

        for (int i = 0; i < 5; i++) {
            n[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (n[j] > n[j + 1]) {
                    int t = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = t;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(n[i]);
        }
    }
}
