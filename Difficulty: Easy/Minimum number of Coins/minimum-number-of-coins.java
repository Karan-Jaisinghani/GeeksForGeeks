class Solution {
    public int findMin(int amount) {
        int [] coins = { 1, 2, 5, 10 };
        int i=coins.length-1;
        int ans = 0;
        while( amount>0 && i>=0){
            if(amount/coins[i]>=1){
                amount = amount - coins[i];
                ans++;
            }
            else{
                i--;
            }
        }
        if(amount!=0){
            return -1;
        }
        return ans;
    }
}
