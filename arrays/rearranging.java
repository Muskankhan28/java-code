package arrays;

public class rearranging {
    public static int [] rearrangearray(int arr[]){
        int count = 0  ;
        int count1 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                count++;
            }
            else if(arr[i]>0){
                count1 ++;
            }
        }
        int temp[] = new int[count];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < 0){
                temp[j] = arr[i];
                j++;
            }
        }
        int newtemp[] = new int[count1];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0){
                newtemp[k] = arr[i];
                k++;
            }
        }
        int m=0;
        int q=0;
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                arr[i] = temp[m];
                m++;
            }
            else{
                arr[i] = newtemp[q];
                q++;
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int arr[] = {3,1,-2,-5,2,-4};
        int ans[] = rearrangearray(arr);
        for (int i : ans) {
            System.out.print(i+ " ");
            
        }
       
        
    }
 }
    

