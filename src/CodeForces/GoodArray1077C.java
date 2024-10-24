package CodeForces;
import java.util.*;
public class GoodArray1077C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
//        Number of elements
        int n = scanner.nextInt();

//        List of positions to print
        ArrayList<Integer> finalJ = new ArrayList<>();

//        Filling Array
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }

        int current;

//        Holding each element and summing the rest
        for (int j = 0; j < n; j++) {

//            Always create new list of positions/ Reset Positions
            ArrayList<Integer> positions = new ArrayList<>();
//            Reset Sum
            int sum = 0;

//            Next element
            current = array.get(j);

//            Finding Sum of rest
            array.remove(j);
            for (int num : array) {
                sum += num;
            }

//            Replacing with another item so that current element itself doesn't get removed/counted as removable
            array.add(j, -1);

//            How far we are from target, finding the removable element
            int find = sum - current;

//            If array has that element, fetch its index+1 (j starts from 1), removing it from the array
            int addLoss = 0;
            while (array.contains(find)) {

                int jk = array.indexOf(find) + 1;
                if(jk-1!=j) {
                    positions.add(jk+addLoss);
                    array.remove(Integer.valueOf(find));
                }

                addLoss++;
            }

//
            for (int num2 : positions) {
                finalJ.add(num2);
                array.add(num2 - 1, find);
            }
//            Get the original array again
            array.set(j, current);
        }

        System.out.println(finalJ.size());
        for(int num3 : finalJ){
            System.out.print(num3+" ");
        }

    }
}
