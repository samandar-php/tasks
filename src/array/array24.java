package array;

import java.util.Arrays;
import java.util.Scanner;

public class array24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        Arrays.sort(array);
       int summa = 0;
        for (int i = 2; i < count; i++) {
            if (array[i] - array[i - 1] != array[1] -array[0]) {
               summa+=array[i]+array[i-1];
                break;
            }
        }
        System.out.println(summa);
    }
}
