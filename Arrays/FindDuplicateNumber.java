/**
Name: Find the Duplicate Number
link:https://leetcode.com/problems/find-the-duplicate-number/
 */

class FindDuplicateNumber{

    public static int findDuplicate(int nums[]){
        if(nums== null && nums.length==0){
            return -1;
        }
        int slowPointer=nums[0];
        int fastPointer=nums[0];
        do{
            slowPointer=nums[slowPointer];
            fastPointer=nums[nums[fastPointer]];
        }while(slowPointer!=fastPointer);
        slowPointer=nums[0];
        while(slowPointer!=fastPointer){
            slowPointer=nums[slowPointer];
            fastPointer=nums[fastPointer];
        }
        return slowPointer;
    }
    public static void main(String args[]){

        int[] nums={3,1,3,4,2};

        int result=FindDuplicateNumber.findDuplicate(nums);
        System.out.println("result:"+result);
    }
}