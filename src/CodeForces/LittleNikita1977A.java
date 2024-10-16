package CodeForces;
import java.util.*;
public class LittleNikita1977A {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int t = scanner.nextInt();
        for(int i=1; i<=t; i++){
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            if(n==m){
                System.out.print("Yes");
            }
            else if(n<m){
                System.out.print("No");
            }
            else{
                if((n-m)%2==0){
                    System.out.print("Yes");
                }
                else{
                    System.out.print("No");
                }
            }
        }
    }
}
