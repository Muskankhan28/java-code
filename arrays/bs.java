package arrays;

public class bs {
    public static int binarySearch(int nums[],int target){
        int si=0;
        int ei =nums.length-1;
        while(si<=ei){
            int mid = si+(ei-si/2);
            if(nums[mid] == target ){
                return mid;
            }
            else if(nums[mid]>target){
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,3,5,12};
        int target = 5;
        System.out.println(binarySearch(nums, target));
        
    }
    
}
