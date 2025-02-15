package begin;

import java.util.Scanner;

public class begin_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        System.out.println("Perimetr: " + 2 * (Math.abs(x2 - x1) + Math.abs(y2 - y1)));
        System.out.println("Yuzasi: " + Math.abs(x2 - x1) * Math.abs(y2 - y1));
    }
}
