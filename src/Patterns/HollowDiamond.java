package Patterns;
import java.util.*;
public class HollowDiamond {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                boolean condition;
                if(i <= (n / 2) + 1){
                    condition = (j < (((n / 2) + 1) - (i - 2))) || (j > (((n / 2) + 1) + (i - 2)));
                } else {
                    condition = (j < (((n / 2) + 1) - (i - (2)))) || (j > (((n / 2) + 1) + (i - 2)));
                }
                if(condition){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}