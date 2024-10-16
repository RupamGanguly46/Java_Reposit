package Patterns;
import java.sql.SQLOutput;
import java.util.Scanner;
public class TriangularPit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row = 1;
        int n = scanner.nextInt();
        int star;
        int space;
        while(row<=n){
            star = 1;
            while(star<=row){
                System.out.print("* ");
                star++;
            }

            space = 2*n-row;
            while(space>row){
                if(space==row+1){
                    System.out.print("");
                }
                else {
                    System.out.print("  ");
                }
                space--;
            }

            star = 1;
            while(star<=row){
                if(star==row) {
                    if (row == n) {
                        System.out.print("");
                    } else {
                        System.out.print("*");
                    }
                }
                else{
                System.out.print("* ");
                }
                star++;
            }

            row++;
            System.out.println();
        }
    }
}
