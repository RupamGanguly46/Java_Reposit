
package LeetCode;
import java.util.*;

public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        for(int a = 0; a < nums.length; a++){
            for(int b = a + 1; b < nums.length; b++){
                for(int c = b + 1; c < nums.length; c++){
                    for(int d = c + 1; d < nums.length; d++){
                        if(nums[a]+nums[b]+nums[c]+nums[d]==target){
                            List<Integer> newArr = Arrays.asList(nums[a],nums[b],nums[c],nums[d]);
                            Collections.sort(newArr);

                            if(!result.contains(newArr)){
                                result.add(newArr);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        int[] num = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        System.out.println(fourSum(num, 8));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}