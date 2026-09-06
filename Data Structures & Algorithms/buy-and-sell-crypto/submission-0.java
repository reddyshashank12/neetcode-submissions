class Solution {
    public int maxProfit(int[] prices) {
        int mini = Integer.MAX_VALUE;
        int profit = 0;

        for(int i: prices){
            mini = Math.min(i,mini);
            profit = Math.max(i-mini,profit);

        }

        return profit;
    }
}
