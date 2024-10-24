
package CodeForces;
import java.util.*;
public class Talesofasort1856AEasy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tests = scanner.nextInt();
        for (int t = 0; t < tests; t++) {
            int n = scanner.nextInt();
            int[] array = new int[n];

            // Read the array
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            // Determine if the array is sorted and find the maximum value
            int maxValue = Integer.MIN_VALUE;
            boolean isSorted = true;

            for (int i = 0; i < n; i++) {
                if (i > 0 && array[i] < array[i - 1]) {
                    isSorted = false; // Found an unsorted part
                }
                maxValue = Math.max(maxValue, array[i]);
            }

            // If already sorted
            if (isSorted) {
                System.out.println(0);
            } else {
                // For unsorted array, return the maximum value
                System.out.println(maxValue);
            }
        }
    }
}
