package string;

import java.util.Scanner;

public class string12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int n = input.nextInt();
        String sep = "*".repeat(n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(i));
            if (i < s.length() - 1) {
                result.append(sep);
            }
        }

        System.out.println(result);
    }
}
