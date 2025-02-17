package fors;

import java.util.Scanner;

public class fors_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 1;
        for (int i = a; i <= b; i++) {
            c *= i;
        }
        System.out.println(c);
    }
}
