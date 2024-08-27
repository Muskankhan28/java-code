package bitmanipualation;

public class encryptedsum {
    public static int sumOfEncryptedInt(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int temp = nums[i];
            int count = 0;
            int max = 0;
            while(temp != 0){
                int dig = temp%10;
                if(dig>max)
                max = dig;
                temp = temp/10;
                count ++;
            }
            int result = 0;
            while(count>0){
                result = result*10+max;
                count--;
                
            }
            nums[i]=result;
        }
        int sum = 0;
        for(int j = 0; j<nums.length;j++){
            sum+=nums[j];
        }
        return sum;
    }
   
    public static void main(String[] args) {
        int arr[] = {10,21,31};
        System.out.println(sumOfEncryptedInt(arr));
    }
    
}
