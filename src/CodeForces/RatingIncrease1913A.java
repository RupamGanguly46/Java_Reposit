package CodeForces;
import java.util.*;
public class RatingIncrease1913A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        scanner.nextLine();
        for(int t=0; t<tests; t++){

            String number = scanner.nextLine();
            int bStart = 0;
            for(int i=1; i<number.length(); i++){
                if(number.charAt(i)!='0'){
                    bStart = i;
                    break;
                }
            }
            String a = number.substring(0, bStart);
            String b = number.substring(bStart);
            int inta = Integer.parseInt(a);
            int intb;
//            if(b.isEmpty()){
            if(b==number){
                intb = 0;
            }
            else{
                intb = Integer.parseInt(b);
            }

            if(inta<intb){
                System.out.println(inta+" "+intb);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
