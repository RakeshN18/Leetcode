class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxProfit=-1;
        int minStockPrice=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            minStockPrice=Math.min(minStockPrice,prices[i]);
            maxProfit= Math.max(maxProfit,prices[i]-minStockPrice);
        }
        return maxProfit;


        
    }
}