package arrays;
import java.util.*; 
public class threesumoptimizedapproach {
    public static List<List<Integer>>threesum(int arr[]){
        int n=arr.length;
        List<List<Integer>>ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i!=0 && arr[i] == arr[i-1]){
                continue;
            }
                int j=i+1;
                int k=n-1;
                while(j<k){
                    int sum = arr[i]+arr[j]+arr[k];
                    if(sum<0){
                        j++;
                    }
                    else if(sum>0){
                        k--;
                    }
                    else{
                        List<Integer>list = Arrays.asList(arr[i] , arr[j] , arr[k]);
                        ans.add(list);
                        j++;
                        k--;
                        while(j<k && arr[j]==arr[j-1]){
                            j++;
                        }
                        while(j<k && arr[k]==arr[k+1]){
                            k--;
                        }
                    }
                    
                }
            }
            return ans;     
        }
    public static void main(String[] args) {
        int arr[] = { -1,0,1,2,-1,-4};
        List<List<Integer>>answer = threesum(arr);
        for(List<Integer> i : answer){
            System.out.print(i+ " ");
        }
    }
    
}
