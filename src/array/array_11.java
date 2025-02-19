package array;

import java.util.Scanner;

public class array_11 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int count = scanner.nextInt();
        int n = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i]+ " ");
        }

        for (int i = count - 1; i < n; i += count) {
            System.out.print(array[i]+ " ");
        }
    }
}
