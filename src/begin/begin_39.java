package begin;

import java.util.Scanner;

public class begin_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        double D = Math.sqrt(B * B - 4 * A * C);
        System.out.println("x1= " + (-B + D) / (2 * A));
        System.out.println("x2= " + (-B - D) / (2 * A));
    }
}
