package arrays;
import java.util.*;

public class foursumoptimized {
    public static List<List<Integer>>foursum(int arr[],int target){
        int n=arr.length;
        List<List<Integer>>ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(j>i+1 && arr[j] == arr[j-1]){
                    continue;
                }
                int k = j+1;
                int l = n-1;
                while(k<l){
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                     if(sum<target){
                        k++;
                    }
                    else if (sum>target){
                        l--;
                    }
                    else{
                        List<Integer>list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);
                        list.add(arr[l]);
                        ans.add(list);
                        k++;
                        l--;

                    while(k<l && arr[k] == arr[k-1]){
                        k++;
                    }
                    while(k<l && arr[l] == arr[l+1] ){
                        l--;
                    }
                }

            }
        } 

    }
    return ans;

}
    public static void main(String[] args) {
        int arr[] = {1,0,-1,-2,2,0};
        int target = 0;
        List<List<Integer>> answer = foursum(arr, target);
        for(List<Integer> i : answer){
            System.out.print(i+ " ");
        }
    }
    
}
