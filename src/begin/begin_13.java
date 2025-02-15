package begin;

import java.util.Scanner;

public class begin_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int R1 = input.nextInt();
        int R2 = input.nextInt();
        System.out.println(3.14 * R1 * R1);
        System.out.println(3.14 * R2 * R2);
        System.out.println(3.14 * (R1 * R1 - R2 * R2));
    }
}
