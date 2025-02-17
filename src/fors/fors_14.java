package fors;

import java.util.Scanner;

public class fors_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= 2 * n - 1; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
