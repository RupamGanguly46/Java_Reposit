package CodeForces;
import java.util.*;
public class YogurtSale1995A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for(int i=0;i<t;i++){

            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if(a<=(b/2)){
                System.out.println(a*n);
            }
            else{
                System.out.println(
                        (
                                ((n-(n%2))/2)*b
                        )+(
                                (n%2)*a
                        )
                );
            }

        }
    }
}