package array;

import java.util.Scanner;

import static java.lang.Math.pow;

public class array04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first_step =  scanner.nextInt();
        int until = scanner.nextInt();
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = (int) (first_step * pow(until,i));
        }
        for (int j : array) {
            System.out.print(j+" ");
        }

    }
}
