package CodeForces;
import java.util.*;
public class Talesofasort1856A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int tests = scanner.nextInt();
        for(int t=0; t<tests; t++){

            int n = scanner.nextInt();
            int[] array = new int[n];
            for(int i=0; i<n; i++) {
                array[i] = scanner.nextInt();
            }

            int[] arraycopy = Arrays.copyOf(array, n);
            Arrays.sort(arraycopy);

            int ops = 0;
            while(!Arrays.equals(array,arraycopy)){
                for(int i=0; i<n; i++){
                    array[i] = Math.max(0, array[i]-1);
                }
                ops++;
                arraycopy = Arrays.copyOf(array, n);
                Arrays.sort(arraycopy);
            }
            System.out.println(ops);
        }
    }
}
