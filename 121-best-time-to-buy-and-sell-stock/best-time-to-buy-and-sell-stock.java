class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxProfit=0;

        for(int i=1;i<prices.length;i++){
            int currPrice=prices[i];
            if(currPrice<minPrice){
                minPrice=currPrice;
            }
            int profit=currPrice-minPrice;
            maxProfit=Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}