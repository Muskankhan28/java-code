package greedy;
import java.util.*;
public class MinimumTimeToCompleteAllTaks {
    public static int minimumRounds(int tasks[]){
        int n = tasks.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(tasks[i])){
                map.put(tasks[i],map.get(tasks[i])+1);
            }
            else{
                map.put(tasks[i],1);
            }
        }
        Set<Integer>key = map.keySet();
        int round = 0;
        for(Integer i : key){
            int count = map.get(i);
            if(count == 1){
                return -1;
            }
            else if(count%3 == 0){
                round = round+count/3;
            }
            else{
                round = round+(count)/3+1;
            }
        }
        return round;
    }
    public static void main(String[] args) {
        int tasks[] = { 2,2,3,3,2,4,4,4,4,4};
        int ans = minimumRounds(tasks);
        System.out.println(ans);
    }
    
}
