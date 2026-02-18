class Solution {
    public int maxProfit(int[] prices) {
       int temp = 0;
        int ans = 0;
        for(int i =1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                ans = Math.max(ans ,Math.max(prices[i]-prices[i-1] , prices[i]-prices[temp]));
                if(prices[i-1]<prices[temp]){
                temp =i-1;}
            }
        }
        return ans;
        
    }
}