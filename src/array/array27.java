package array;

import java.util.Scanner;

public class array27 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int count = scanner.nextInt();
            int[] array = new int[count];
            for (int i = 0; i < count; i++) {
                array[i] = (int) (Math.random() * 100);
                System.out.print(array[i] + " ");
            }
int a = 0;
        for (int i = 1; i < count; i++) {
            if ((array[i] > 0 && array[i - 1] > 0) || (array[i] < 0 && array[i - 1] < 0)) {
                a = i + 1;
                break;
            }
        }
        System.out.println(a);
    }
}
