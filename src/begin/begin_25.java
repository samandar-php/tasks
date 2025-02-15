package begin;

import java.util.Scanner;

public class begin_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("y= " + (3 * Math.pow(x, 6) - 6 * Math.pow(x, 2) - 7));
    }
}
