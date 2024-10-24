package CodeForces;
import java.util.*;

public class MorningSandwich1849A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        for(int t=0; t<tests; t++){
            int bread = scanner.nextInt();
            int filling = scanner.nextInt() + scanner.nextInt();
            if(bread<=filling){
                System.out.println(bread+bread-1);
            }
            else{
                System.out.println(filling+filling+1);
            }
        }
    }
}