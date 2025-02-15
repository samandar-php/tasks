package begin;

import java.util.Scanner;

public class begin_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a * a + b * b);
        System.out.println(a * a - b * b);
        System.out.println(a * a * b * b);
        System.out.println(a * a / b * b);
    }
}
