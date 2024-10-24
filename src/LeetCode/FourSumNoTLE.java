package LeetCode;

import java.util.*;

public class FourSumNoTLE {
    public static void main(String[] args){
//        int[] num = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
//        int t = 8;

        int[] num = {0,0,0,1000000000,1000000000,1000000000,1000000000};
        int t = 1000000000;
        System.out.println(func(num, t));
    }
    public static List<List<Integer>> func(int[] nums, int target){
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        long startSum = (long) nums[0]+nums[1]+nums[2]+nums[3];
        long endSum = (long) nums[n-1]+nums[n-2]+nums[n-3]+nums[n-4];

        Arrays.sort(nums);
        if(nums.length<4 || startSum>target || endSum<target){
            return result;
        }

        for(int i=0; i<nums.length-3; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1; j<nums.length-2; j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int left = j+1;
                int right = n-1;
                while(left<right){
                    if(left>j+1 && nums[left]==nums[left-1]){
                        left++;
                        continue;
                    }
                    if(right<n-1 && nums[right]==nums[right+1]){
                        right--;
                        continue;
                    }
                    long sum = (long) nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                    }
                    else if(sum<target){
                        left++;
                    }
                    else if(sum>target) {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}

// You can compare long and int
// You need to check after sorting the nums array that
// Sum of smallest numbers should not be greater than target
// Sum of largest numbers should not be smaller than target
// Number of numbers should not be less than 4 for quadriplets
// There should be no repetition of elements, check the number before if it was same as current, so we skip that number
