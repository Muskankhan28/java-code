package arrays;

public class majele {
    public static int majorityelement(int arr[]){
        int n =arr.length;
        int count = 0;
        int element = 0;
        for(int i=0;i<arr.length;i++){
            if(count == 0){
                count = 1;
                element = arr[i];
            }
            else if(arr[i] == element){
                count ++;
            }
            else{
                count --;
            }
          
        }
        int count1 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == element){
                count1 ++;
            }
            if(count1>n/2){
                return element;

            }
            
        }
        return -1;

    }
       
    
    public static void main(String[] args) {
        int arr[] = { 2,2,1,1,1,2,2};
    
        int ans  = majorityelement(arr);
        System.out.println("majority element in an array -> " + ans);
        
    }
    
}
