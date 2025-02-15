package begin;

import java.util.Scanner;

public class begin_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int S = input.nextInt();
        System.out.println("Diametri: " + Math.sqrt(4 * S / 3.14));
        System.out.println("Uzunligi: " + 3.14 * Math.sqrt(4 * S / 3.14));
    }
}
