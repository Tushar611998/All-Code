package LeetCode.Arrays;

public class BestTimeToBuyANsSellStocks {
    public static  int maxProfit(int[] prices) {

        int minPrice =Integer.MAX_VALUE;
        int minIndex =Integer.MAX_VALUE;
        int maxPrice=Integer.MIN_VALUE;
        for(int i =0;i<prices.length;i++){

            if(prices[i] < minPrice){
                minPrice =prices[i];
                minIndex =i;
            }
        }

        for(int i =minIndex+1;i<prices.length;i++){
            if(prices[i]>maxPrice){
                maxPrice =prices[i];
            }
        }
        if(maxPrice< minPrice ){
            return 0;
        }
        return maxPrice -minPrice-1;

    }

    public static void main(String[] args) {
        int arr[] = {7,6,4,3,1};
        int ans = maxProfit(arr);
        System.out.println(ans);

    }
}
