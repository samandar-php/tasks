package string;

import java.util.Scanner;

public class string06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        if (Character.isDigit(input)) {
            System.out.println("raqam");
        } else if (Character.isUpperCase(input)) {
            System.out.println("kapital");
        } else {
            System.out.println("kichik");
        }

    }
}
