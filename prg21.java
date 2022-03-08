package Java;

public class prg21 {
    public static void main(String[] args) {
        String str = "Sardar Patel University";
        StringBuffer str1 = new StringBuffer(str);
        int count = 0;

        /*
         * String arr[]=str.split(" "); / /output : Sardar
         * System.out.println("Hello "+arr[0]);
         */

        /*
         * we can also use split function to Saperate word in String....
         */

        String rev = "";
        for (int i = str.length() - 1; i > 0; i--) {
            rev += str.charAt(i);
            if (str.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("Length of the String is :" + str.length());
        System.out.println("Upper Case : " + str.toUpperCase());
        System.out.println("Reverse String is : " + rev);
        System.out.println("Upper Case : " + str.toLowerCase());
        System.out.println("No of Occurences of character a is : " + count);
        System.out.println("Capacity of the String is : " + str1.capacity());
        System.out.println("Substring : " + str.substring(0, 6));
    }
}
