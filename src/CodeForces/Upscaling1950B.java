package CodeForces;
import java.util.Scanner;

public class Upscaling1950B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int test = 0; test < t; test++) {
            int n = scanner.nextInt();

            int size = 2 * n;
            char[][] checkerboard = new char[size][size];

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    int blockRow = i / 2;
                    int blockCol = j / 2;

                    if ((blockRow + blockCol) % 2 == 0) {
                        checkerboard[i][j] = '#';
                    } else {
                        checkerboard[i][j] = '.';
                    }
                }
            }

            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(checkerboard[i][j]);
                }
                System.out.println();
            }

        }

        scanner.close();
    }
}
