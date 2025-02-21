package array;

import java.util.Scanner;

public class array13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        for (int i = count - 1; i >= 0; i -= 2) {
            System.out.print(array[i] + " ");
        }
    }
}
