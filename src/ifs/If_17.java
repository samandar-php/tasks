package ifs;

import java.util.Scanner;

public class If_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b && b < c) {
            a = a + 2;
            b = b + 2;
            c = c + 2;
        } else {
            a = -a;
            b = -b;
            c = -c;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
