package CodeForces;
import java.util.*;
public class CatchTheCoin1989A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<n; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if(y<-1){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
