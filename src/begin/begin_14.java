package begin;

import java.util.Scanner;

public class begin_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int L = input.nextInt();
        System.out.println("Radius: " + L / (2 * 3.14));
        System.out.println("Yuzasi: " + 3.14 * (L / (2 * 3.14)) * (L / (2 * 3.14)));
    }
}
