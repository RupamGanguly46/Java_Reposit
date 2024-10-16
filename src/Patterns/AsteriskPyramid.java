package Patterns;
import java.util.Scanner;
public class AsteriskPyramid {
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);

        int Num_of_rows = 5;
        int Number_of_stars = Num_of_rows;
        int Current_row = 1;

        while(Current_row<=Num_of_rows){

            int Current_star = 1;

            while(Current_star <= Number_of_stars){
                System.out.print("* ");
                Current_star++;
            }
            System.out.println();
             Current_row+= 1;
        }

    }
}
