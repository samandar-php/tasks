package ifs;

import java.util.Scanner;

public class If_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int f;
        if (x < -2 || x > 2) {
            f = 2 * x;
        } else {
            f = -3 * x;
        }
        System.out.println(f);
    }
}
