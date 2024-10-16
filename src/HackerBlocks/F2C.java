package HackerBlocks;
import java.util.*;
public class F2C {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int step = scanner.nextInt();
        int cels;
        for(int fahr=min; fahr<=max; fahr += step){
            cels = (int)((fahr - 32)*(5.0/9.0));
            System.out.println(fahr+"   "+cels);
        }
    }
}
