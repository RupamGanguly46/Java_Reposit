package CodeForces;
import java.util.*;
public class TwoElevators1729A {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        int t = scanner.nextInt();
        while(t!=0){
            Run();
            t--;
        }
    }

    public static void Run(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int first = Math.abs(a-1);
        int second = Math.abs(b-c)+Math.abs(c-1);

//        System.out.println("First is:" + first);
//        System.out.println("Second is" + second);

        if(first<second){
            System.out.println(1);
        }
        else if(first>second){
            System.out.println(2);
        }
        else{
            System.out.println(3);
        }
    }
}
