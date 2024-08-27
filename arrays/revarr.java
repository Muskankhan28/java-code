package arrays;

public class revarr {
    public static  void rversearr(int nums[]){
        int start=0;
        int end = nums.length-1;
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        rversearr(nums);
        for (int i : nums) {
            System.out.print(i + " ");  
        }
    }
}
