package LeetCode;
//import java.util.*;
//public class ThreeSum {
//    public static void main(String[] args){
//        int[] num = {-1,0,1,2,-1,-4};
//        System.out.println(threeSum(num));
//    }
//    public static List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        int target = 0;
//        List<List<Integer>> result = new ArrayList<>();
//
//        if(n < 3 || (long)nums[0]+nums[1]+nums[2]>target || (long)nums[n-1]+nums[n-2]+nums[n-3]<target ){
//            System.out.println("Early return");
//            return result;
//        }
//
//        for(int i = 0; i < nums.length-2; i++ ){
//            if(i>0 && nums[i]==nums[i-1]){
//                continue;
//            }
//            for(int j = i + 1; j < n-1; j++ ){
//                if(j>i+1 && nums[j]==nums[j-1]){
//                    continue;
//                }
//                for(int k = j + 1; k < n; k++){
//                    System.out.println("i = "+i+" j = "+j+" k = "+k);
//                    if(k>j+1 && nums[k]==nums[k-1]){
//                        continue;
//                    }
//                    if(nums[i]+nums[j]+nums[k]==target){
//                        result.add(Arrays.asList(nums[i],nums[j],nums[k]));
//                    }
//                }
//            }
//        }
//        return result;
//    }
//}
//
//

import java.util.*;
class Threesum{
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int target = 0;
        List<List<Integer>> result = new ArrayList<>();

        if(n < 3 || nums[0]+nums[1]+nums[2]>target || nums[n-1]+nums[n-2]+nums[n-3]<target ){
            return result;
        }

        for(int i = 0; i < n-2; i++ ){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = n-1;
            while(left<right){
                if(left>i+1 && nums[left]==nums[left-1]){
                    left++;
                }
                if(right<n-1 && nums[right]==nums[right-1]){
                    right--;
                }
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==target){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                }
                else if(sum<target){
                    left++;
                }
                else if(sum>target){
                    right--;
                }
            }
        }
        return result;
    }
}

