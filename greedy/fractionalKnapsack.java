package greedy;
import java.util.*;

public class fractionalKnapsack {
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;
        double ratio[][] = new double[val.length][2];
        // 0th coloumn holdes the originall index
        // 1st coloumn holdes the ration 
        for(int i=0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        // lambda function
        // ascending order sorting
        Arrays.sort(ratio , Comparator.comparingDouble(o->o[1]));           // here i am doing sorting on the ratio coloumn
        int capacity = W;
        int ans = 0;
        for(int i=ratio.length-1;i>=0;i--){
            int index = (int)ratio[i][0];
            if(capacity >= weight[index]){ // include kar skti hu full  item ko
                ans += val[index];
                capacity = capacity-weight[index];
            }
            else{                     // include fractional item
                ans += (int)Math.round(ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("final answer" + " -> " + ans);
    }
}
