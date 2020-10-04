/**
Name: Best time to buy and sell stock for maximum profit
Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

 */

class BuySellStock{

    public static int getMaxProfit(int prices[]){

        if(prices ==null || prices.length==0){
            return 0;
        }

        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int index=0;index<prices.length;index++){
            if(min > prices[index]){
                min=prices[index];
            }else{
                maxProfit=Math.max(prices[index]-min,maxProfit);
            }
        }
        return maxProfit;
    }

    public static void main(String args[]){

        int prices[]={7,1,4,3,6};
        System.out.println("The maximum profit is "+BuySellStock.getMaxProfit(prices));
    }
}