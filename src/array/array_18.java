package array;

import java.util.Scanner;

public class array_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        System.out.println("\n");
        if (array[count] < array[9]){
            System.out.println(array[count]);

        }else {
            System.out.println(0);
        }
    }
}
