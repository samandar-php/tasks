package array;

import java.util.Scanner;

public class array29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        double a = array[0];
        for (int i = 1; i < count; i += 2) {
            if (array[i] > a) {
                a = array[i];
            }
        }
        System.out.println(a);
    }
}
