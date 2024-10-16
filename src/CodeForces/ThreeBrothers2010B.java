package CodeForces;
import java.util.*;
public class ThreeBrothers2010B {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // if(a==1){
        //     if(b==2){
        //         System.out.print(3);
        //     }
        //     else{
        //         System.out.print(2);
        //     }
        // }
        // else if(a==2){
        //     if(b==1){
        //         System.out.print(3);
        //     }
        //     else{
        //         System.out.print(1);
        //     }
        // else if(a==3){
        //     if(b==2){
        //         System.out.print(1);
        //     }
        //     else{
        //         System.out.print(2);
        //     }
        // }

        if( (a==1 && b==2)||(a==2 && b==1) ){
            System.out.print(3);
        }
        else if( (a==2 && b==3)||(a==3 && b==2) ){
            System.out.print(1);
        }
        else if( (a==3 && b==1)||(a==1 && b==3) ){
            System.out.print(2);
        }
    }
}
