package fors;

import java.util.Scanner;

public class fors_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }
}
