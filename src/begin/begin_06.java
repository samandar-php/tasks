package begin;

import java.util.Scanner;

public class begin_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("Hajmi: " + a * b * c);
        System.out.println("Sirti: " + 2 * (a * b + b * c + a * c));
    }
}
