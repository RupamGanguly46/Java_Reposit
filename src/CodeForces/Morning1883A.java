package CodeForces;
import java.util.*;
public class Morning1883A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while(t!=0){
            String input = scanner.nextLine();
            String[] arr = input.split("");

            for(int i=0; i<arr.length; i++){
//                System.out.println(arr[i] + "\n" + arr[i].getClass().getName());
                if(arr[i].equals("0")){
                    arr[i]="10";
                }
            }


            int d1= Integer.parseInt(arr[0]);
            int d2= Integer.parseInt(arr[1]);
            int d3= Integer.parseInt(arr[2]);
            int d4= Integer.parseInt(arr[3]);
            int totalSteps = 4 + (d1-1) + Math.abs(d1-d2) + Math.abs(d2-d3) + Math.abs(d3-d4);
            System.out.println(totalSteps);
            t--;
        }
    }
}