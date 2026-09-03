class Solution {
    public int maxProfit(int[] prices) {
     int minPrice=prices[0];
     int maxProfit=0;

     for(int j=1;j<prices.length;j++){
        if(minPrice>prices[j]){
            minPrice=prices[j];

        }
        int currProfit=prices[j]-minPrice;
        if(currProfit>maxProfit){
            maxProfit=currProfit;
        }
     } 
     System.out.println(minPrice);  
     return maxProfit;
    }
}
