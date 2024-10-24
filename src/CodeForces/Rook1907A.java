package CodeForces;
import java.util.*;
public class Rook1907A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        scanner.nextLine();
        for(int t=0; t<tests; t++){
            String rook = scanner.nextLine();
            char col = rook.charAt(0);
            int row = Character.getNumericValue(rook.charAt(1));
            for(int r=1; r<=8; r++){
                if(r!=row) {
                    System.out.println(Character.toString(col) + r);
                }
            }
            for(int j=0; j<8; j++){
                char c = (char) (97+j);
                if(c!=col) {
                    System.out.println(Character.toString(c) + row);
                }
            }
        }
    }
}
