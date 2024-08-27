package bitmanipualation;

public class lexicogrpahicallysmallest {
    public static String getsmallesststring(String s){
        String ans = "";
        char arr[] = s.toCharArray();
        int i=0;
        int j=i+1;
        int n = arr.length;
        while(j<n){
            if(arr[i]%2 == 0 && arr[j]%2 ==0){
                if(arr[i]>arr[j]){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                break;
                }  
            }
            else if(arr[i]%2 != 0 && arr[j]%2 !=0){
                if(arr[i]>arr[j]){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                break;
                }  
            }
            i++;
            j++;
        }
        for (char c : arr) {
            ans += c;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "001";
        System.out.println(getsmallesststring(s));
     
        // for (char c : arr) {
        //     System.out.println(c + " ");
            
        // }
    }
    
}
