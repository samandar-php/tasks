package string;

import java.util.Scanner;

public class string03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        System.out.println((char) (input - 1));
        System.out.println((char) (input + 1));
    }
}
