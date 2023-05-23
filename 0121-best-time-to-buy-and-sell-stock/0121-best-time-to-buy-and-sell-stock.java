class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min_no = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            min_no=Math.min(min_no,prices[i]);
            profit =Math.max(profit,prices[i]-min_no);
        }
        return profit;
    }
}