package fors;

import java.util.Scanner;

public class fors_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int c = 1;
        for (int i = 1; i <= n; i++) {
            c *= i;
            sum += c;
        }
        System.out.println(sum);
    }
}
