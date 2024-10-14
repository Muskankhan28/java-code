package greedy;
import java.util.*;

public class boatToSavePeople {
    public static int MinimumNoOfBoatsRequired(int people[] , int limit){
        int n = people.length;
        Arrays.sort(people);
        int i=0;
        int j=n-1;
        int minimumBoats = 0;
        while(i<=j){
            if(people[i] + people[j] <= limit){
                minimumBoats++;
                i++;
                j--;
            }
            else if(people[i] + people[j] >= limit){
                minimumBoats++;
                j--;

            }
            else{
                return minimumBoats;
            }
           
        }
        return  minimumBoats;
    }
    public static void main(String[] args) {
        int people[] = {2,6,4,9};
        int limit  = 10;
        int ans = MinimumNoOfBoatsRequired(people, limit);
        System.out.println(ans);
    }
    
}
