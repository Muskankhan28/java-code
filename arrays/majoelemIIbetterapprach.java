package arrays;
import java.util.*;
public class majoelemIIbetterapprach {
    public static ArrayList<Integer>majorityElement(int arr[]){
        int n=arr.length;
        ArrayList<Integer>list = new ArrayList<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        int minimum = (int)(n/3)+1;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
            if(map.get(arr[i]) == minimum){
                list.add(arr[i]);
            }
            if(list.size() == 2){
                break;
            }
        }
        return list;
    



        // for(int i=0;i<n;i++){
        //     if(map.containsKey(arr[i])){
        //         map.put(arr[i],map.get(arr[i])+1);
        //     }
        //     else{
        //         map.put(arr[i],1);
        //     }
        // }
        // Set<Integer>keys = map.keySet();
        // for(Integer i : keys){
        //     if(map.get(i) > n/3){
        //         list.add(i);
        //     }
        //     if(list.size()==2){
        //         break;
        //     }
        // }
        // return list;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,3,3,2,2,2};
        ArrayList<Integer>ans = majorityElement(arr);
        for(Integer i: ans){
            System.out.print(i+" ");
        }

        
    }
    
}
