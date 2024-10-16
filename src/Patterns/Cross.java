package Patterns;

public class Cross {
    public static void main(String[] args){
        int totalRows = 5;
        int row = 1;
        int space = 1;
        int col = 1;
        while(row<=totalRows){
            while(col<=row){
                System.out.print("   ");
                col++;
            }
            col = 1;
            while(col<=totalRows){
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
            col = 1;
        }
    }
}
