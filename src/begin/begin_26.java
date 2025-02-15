package begin;

import java.util.Scanner;

public class begin_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("y= " + (4 * Math.pow(x - 3, 6) - 7 * Math.pow(x - 3, 3) + 2));

    }
}
