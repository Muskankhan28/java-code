package stack;

public class nextgreatestbrute {
    public static void nextgreatest(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        for(int i=0;i<ans.length;i++){
            ans[i] = -1;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j] > arr[i]){
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        for (int i : ans) {
            System.out.print(i+ " ");
            
        }
    }

    public static int[] nextgreatestele(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=i+1;j<n;j++){
                if(arr[j] > arr[i]){
                    ans[i] = arr[j];
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                ans[i] = -1;
            }
        }
        return ans;
    }

    public static void nextgreatestanotherappraoach(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
       
        for(int i=0;i<n;i++){
            boolean flagfound = false;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    ans[i] = arr[j];
                    flagfound = true;
                    break;
                }
            }
            if(flagfound == false){
                ans[i] = -1;
            }
        }
        for (int i : ans) {
            System.out.print(i+ " ");
            
        }
    }
  
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int result[] = nextgreatestele(arr);
        for (int i : result) {
            System.out.print(i+ " ");
            
        }
       
        // nextgreatest(arr);
        // nextgreatestanotherappraoach(arr);
    }
}
