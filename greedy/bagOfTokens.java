package greedy;
import java.util.*;

public class bagOfTokens {

    public static int bagoftokensScore(int tokens[] , int power){
        int n = tokens.length;
        int MaxScore = 0;
        Arrays.sort(tokens);
        int currentScore = 0;

        int i=0;
        int j=n-1;
        while(i<=j){
            if(power >= tokens[i]){
                power = power-tokens[i];
                currentScore++;
                i++;

                MaxScore = Math.max(currentScore , MaxScore);
            }
            else if(currentScore>=1){
                power = power + tokens[j];
                currentScore--;
                j--;
            }
            else{
                return MaxScore;
            }
        }
        return MaxScore;
        
    }
    public static void main(String[] args) {
        int tokens[] = {100,200,300,400};
        int power = 200;
        int ans = bagoftokensScore(tokens, power);
        System.out.println(ans);
    }
    
}
