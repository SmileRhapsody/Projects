package test;

public class Q121_Best_Time_to_Buy_and_Sell_Stock {
	public int maxProfit(int[] prices) {
        int max = 0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                max = Math.max(max,prices[j]-prices[i]);
            }
        }
        if(max<0) return 0;
        else return max;
    }
	
//	2nd Solution
	public int maxProfit2(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i: prices){
            if(i<minPrice)
                minPrice=i;
            if(i-minPrice>maxProfit)
                maxProfit=i-minPrice;
        }
        
        return maxProfit;
    }
}
