package greedy;
import java.util.*;

public class activitySelectionPartII {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {3,4,8,6,7,9};

        int activities[][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0] = i;                     // first row ke first coloumn pr index store krvari hu
            activities[i][1] = start[i];              // first row ke second coloumn pr start[i] pr jo value hai vo store krvari hu
            activities[i][2] = end[i];                // first row ke third coloumn pr end[i] pr jo value hai vo store krvari hu 
        }

        //lambda function 
        Arrays.sort(activities , Comparator.comparingDouble(o -> o[2]));

        int maxActivity = 0;
        ArrayList<Integer>ans = new ArrayList<>();
        ans.add(activities[0][0]);
        maxActivity = 1;
        int lastChoosenEnd = activities[0][2];

        for(int i=1;i<end.length;i++){
            if(activities[i][1] >= lastChoosenEnd){
                maxActivity++;
                ans.add(activities[i][0]);
                lastChoosenEnd = activities[i][2];
            }
        }
        System.out.println("Maximum Activites that can be performed"+ " -> " + maxActivity);

        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i) + " ");
        }
    }
    
}
