package greedy;
import java.util.*;

public class activitySelection {


    // the Activites are sorted acoording to there end time 
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};    // end time basis sorted activity

        int MaximumActivity = 0;
        ArrayList<Integer>ans = new ArrayList<>();  // the arraylist ans will store the index of the activity
        

        // 1st activity
        MaximumActivity = 1;
        ans.add(0);       // sbhse phle vali actitvity to select krni hi h  isliye ans ke andr sbse phle vali actitivity ka index dalva diya h which is 0
        int lastChoosenEndtime = end[0]; 
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastChoosenEndtime){
                // activity select
                MaximumActivity++;
                ans.add(i);
                lastChoosenEndtime = end[i];
            }
        }
        System.out.println("Maximum Activites = " + MaximumActivity);

        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i) + " ");
        }

    }
    
}
