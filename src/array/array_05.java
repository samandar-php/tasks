package array;

import java.util.Scanner;

public class array_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        if (count > 0) array[0] = 0;
        if (count > 1) array[1] = 1;
        for (int i = 2; i < count; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int j : array) {
            System.out.print(j+" ");
        }

    }
}
