package string;

import java.util.Scanner;

public class string05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.print((char) ('a' + i) + " ");
        }
    }
}
