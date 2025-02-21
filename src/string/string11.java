package string;

import java.util.Scanner;

public class string11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
            if (i < input.length() - 1) {
                System.out.print(" ");
            }
        }
    }
}
