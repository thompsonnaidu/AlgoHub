
/*
Subarray with given sum
practice link:https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/0
*/
import java.util.*;
import java.lang.*;

class SubarraySum {


    public static ArrayList<Integer> getSubarrayIndex(int[] arr,int sum){
        if(arr ==null && arr.length==0) return null;
        ArrayList<Integer> result=new ArrayList<Integer>();
        int start=0;
        int currentSum=arr[0];
        for(int i=1;i<arr.length;i++){

            //subtract the current sum with start 
            while(currentSum > sum && start < i-1){
                currentSum=currentSum-arr[start];
                start++;
            }
            
            //you have got the index and now return them
            if(currentSum==sum){
                result.add(start);
                result.add(i);
                return result;
            }

            // we need to process 
            if(i<arr.length)
                currentSum=currentSum+arr[i];
        }

        // no sub array found
        return null;

    }
    public static void main(String[] args){

        int arr[]={1,2,3,7,5};
        int sum=12;
        ArrayList<Integer> result=SubarraySum.getSubarrayIndex(arr,sum);
        if(result==null){
            System.out.println("No sub array found");
        }else{
            for(int index:result){
                System.out.print(index+" ");
            }
        }
    }
}