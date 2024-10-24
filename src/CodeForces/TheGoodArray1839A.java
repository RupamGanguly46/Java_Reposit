package CodeForces;
import java.util.Scanner;
public class TheGoodArray1839A {
    public static Scanner sc = new Scanner(System.in);
    public static void solve() {

        int n = sc.nextInt();  // Length of array
        int k = sc.nextInt();  // Parameter k

        int ans = n;

        // Loop through each i from 1 to n
        for (int i = 1; i <= n; i++) {
            // Calculate the number of ones needed for prefix and suffix
            int low = (i + k - 2) / k;  // Equivalent of ceil(i / k) for prefix
            int high = (n - i + k - 1) / k;  // Equivalent of ceil((n - i + 1) / k) for suffix

            // Find the minimum possible answer
            ans = Math.min(ans, low + high);
        }

        System.out.println(ans + 1);  // Output the result (+1 as per C++ code)
    }

    public static void main(String[] args) {
        int T = sc.nextInt();  // Number of test cases

        while (T-- > 0) {
            solve();
        }
    }
}
