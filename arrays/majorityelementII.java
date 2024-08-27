package arrays;
import java.util.*;

public class majorityelementII {
    public static ArrayList<Integer>majorityelement(int arr[]){
        int n = arr.length;
        ArrayList<Integer>list = new ArrayList<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int minimum = (int)(n/3)+1;
        if(map.get(arr[i]) > minimum){
            
        }
        
       
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,3,3,2,2,2};
    }
}




    // public static ArrayList<Integer>majorityelement(int arr[]){
    //     int n = arr.length;
    //     ArrayList<Integer>list = new ArrayList<>();
    //     for(int i=0;i<n;i++){
    //         if(list.size() == 0 || list.get(0) != arr[i]){
    //             int count = 0;
    //             for(int j=i;j<n;j++){
    //                 if(arr[i] == arr[j]){
    //                     count++;
    //                 }
    //             }
    //             if(count>n/3){
    //                 list.add(arr[i]);
    //             }
    //             if(list.size() == 2){
    //                 break;
    //             }
    //         }
    //     }
    //     return list;
    // }
 

    // public static void main(String[] args) {
    //     int arr[] = {1,1,1,3,3,2,2,2};
    //     ArrayList<Integer>ans = majorityelement(arr);
    //     for (Integer i: ans) {
    //         System.out.print(i+ " ");
            
    //     }


        // for(int i=0;i<ans.size();i++){
        //     System.out.print(ans.get(i) +  " ") ;
        // }
//     }
    
// }




