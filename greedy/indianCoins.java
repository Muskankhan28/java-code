package greedy;
import java.util.*;
public class indianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,200,500,2000};
        int amount = 1051;
        int n = coins.length;
        Arrays.sort(coins , Comparator.reverseOrder());         // this will sort the array into the descending order
        int countOfCoins = 0;
        ArrayList<Integer>ans = new ArrayList<>();              // int the array list we are stoing the notes that we have used
        for(int i=0;i<n;i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount=amount-coins[i];
                }
            }
        }
        System.out.println("total minimum coins used " + " -> " + countOfCoins);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }
    }
    
}
