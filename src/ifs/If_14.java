package ifs;

import java.util.Scanner;

public class If_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b && a < c) {
            System.out.println(a);
            System.out.println(Math.max(b, c));
        } else if (b < a && b < c) {
            System.out.println(b);
            System.out.println(Math.max(a, c));
        } else {
            System.out.println(c);
            System.out.println(Math.max(a, b));
        }
    }
}
