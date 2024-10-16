package Patterns;

public class SquarePyramid {
    public static void main(String[] args){
        int row = 1;
        int totalRows = 5;
        int totalStars = totalRows;
        while(row<=totalRows){
            int star = 1;
            while(star<=totalStars) {
                if (row > 1 && row < totalRows) {
                    if (star > 1 && star < totalStars) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }else {
                    System.out.print("* ");
                }
                star++;
            }
            System.out.println();
            row++;
        }
    }
}
