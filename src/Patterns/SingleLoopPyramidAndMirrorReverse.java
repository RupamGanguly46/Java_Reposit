package Patterns;

public class SingleLoopPyramidAndMirrorReverse {
    public static void main(String[] args){
        int n = 5;
        int star = 1;
        int row = 1;
        int space = n-1;
        while(row<=2*n-1){

            int i = n-1;
            while(i>row){
                System.out.print("  ");
                i++;
            }

            i = 1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            if(row<n){
                star++;
                space--;
            }
            else{
                star--;
                space++;
            }
            System.out.println();
            row++;
        }
    }
}
