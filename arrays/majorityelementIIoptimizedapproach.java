package arrays;
import java.util.*;

public class majorityelementIIoptimizedapproach {
    public static ArrayList<Integer>majorityelement(int arr[]){
        int n=arr.length;
        int count1 = 0;
        int count2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer. MIN_VALUE;
        for(int i=0;i<n;i++){
            if(count1 == 0 && arr[i] != ele2){
                count1 = 1;
                ele1 = arr[i];
            }
            else if(count2 == 0 && arr[i] != ele1){
                count2 = 1;
                ele2 = arr[i];
            }
            else if(arr[i] == ele1){
                count1++;
            }
            else if(arr[i] == ele2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        ArrayList<Integer>list = new ArrayList<>();
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == ele1){
                cnt1++;
            }
            else if(arr[i] == ele2){
                cnt2++;
            }
            
        }
            int minimum = (int)(n/3)+1;
            if(cnt1>=minimum){
                list.add(ele1);
            }
            if(cnt2>=minimum){
                list.add(ele2);
            }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,3,3,2,2,2};
        ArrayList<Integer>ans = majorityelement(arr);
        for(Integer i : ans){
            System.out.print(i+ " ");
        }
    }
    
}
