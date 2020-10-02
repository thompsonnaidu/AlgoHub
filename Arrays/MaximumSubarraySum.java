/*
Max Sum Contiguous Subarray
practice url: https://leetcode.com/problems/maximum-subarray/
*/
import java.util.*;

class MaximumSubarraySum{
    public static int getMaxSum(int nums[]){
        //check edge case
        if(nums==null || nums.length==0){
            return 0;
        }
        int sum=0;
        int max=nums[0];
        //traverse the array
        for(int num:nums){
            sum+=num;
            if(sum > max) max= sum;
            if(sum < 0) sum=0;
        }

        return max;
    }
    public static void main(String args[]){
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result=MaximumSubarraySum.getMaxSum(arr);
        System.out.println("the result is "+result);
    }
}