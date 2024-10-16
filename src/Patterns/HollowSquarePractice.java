package Patterns;

public class HollowSquarePractice {
    public static void func(int n){
        int i, j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int number_of_rows = 10;
        func(number_of_rows);
    }
}
