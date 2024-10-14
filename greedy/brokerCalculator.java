package greedy;

public class brokerCalculator {
    public static int brokerCal(int startValue , int target){
        // base case
        if(startValue == target){
            return 0;
        }
        if(startValue>target){
            return startValue-target;
        }
        if(target%2 == 0){
            // if the number is even are going to divide target by 2
            return 1+brokerCal(startValue, target/2);
        }
           //  if the number is odd we are going to add 1 in the target
        return 1+brokerCal(startValue, target+1);

    }
    public static void main(String[] args) {
        int startValue =2 ;
        int target = 3 ;
        int ans = brokerCal(startValue, target);
        System.out.println(ans);

    }
    
}
