package matrix;

import java.util.Random;
import java.util.Scanner;

public class matrix_010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int height = scanner.nextInt();
        int width = scanner.nextInt();

        int[][] matrix = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = rand.nextInt(100);
            }
        }
        for (int j = 0; j < width; j += 2) {
            for (int i = 0; i < height; i++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
