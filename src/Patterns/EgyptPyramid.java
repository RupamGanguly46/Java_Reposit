package Patterns;

public class EgyptPyramid {
    public static void main(String[] args){
        int n = 5;
        int r = 1;
        int c;
        int space;

        while(r<=n){
//          For triangle of spaces
            space = n;
            while(space>=r){
                System.out.print("  ");
                space--;
            }
//          For pyramid of characters
            c = 1;
            while(c<=r*2-1){
                if(c%2==0){
                    System.out.print("! ");
                }
                else{
                    System.out.print("* ");
                }
                c++;
            }

            System.out.println();
            r++;
        }
    }
}
