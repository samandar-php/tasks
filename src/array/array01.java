package array;

import java.util.Scanner;

public class array01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count =  scanner.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] =  2*i +1;
        }
        for (int j : array) {
            System.out.print(j+" ");
        }

    }
}
