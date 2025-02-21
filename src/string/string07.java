package string;

import java.util.Scanner;

public class string07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println((int) text.charAt(0));
        System.out.println((int) text.charAt(text.length()-1));
    }
}
