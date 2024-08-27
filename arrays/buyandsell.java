package arrays;

public class buyandsell {
    public static int maximumprofit(int prices[]){
        int buyprice = prices[0];
        int profit = 0 ;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buyprice){
                buyprice=prices[i];
            }
            else{
                int currentprofit = prices[i]-buyprice;
                profit=Math.max(currentprofit, profit);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[] = { 7,1,5,3,6,4};
        System.out.println(maximumprofit(prices));
    }
    
}
