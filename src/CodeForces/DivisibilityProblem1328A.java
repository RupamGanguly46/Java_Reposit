//package CodeForces;
//import java.util.*;
//public class DivisibilityProblem1328A {
//
//    static Scanner scanner = new Scanner(System.in);
//    static int t = scanner.nextInt();
//
//    static int[] countsOfEach = new int[t];
//
//    public static void main(String[] args) {
//
//        for(int i=1; i<=t; i++) {
//            countsOfEach[i-1] = count();
//        }
//
//        for(int i=1; i<=t; i++) {
//            System.out.println(countsOfEach[i-1]);
//        }
//    }
//
//    public static int count(){
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int counter = 0;
//        while(a%b!=0){
//            a++;
//            counter++;
//        }
//        return counter;
//    }
//}

package CodeForces;
import java.util.*;
public class DivisibilityProblem1328A {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        for(int i=1; i<=t; i++) {
            System.out.println(count());
        }
    }

    public static int count(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a<b){
            return b-a;
        }
        if(a%b!=0){
            return b - (a%b);
        }
        else{
            return 0;
        }
    }
}
