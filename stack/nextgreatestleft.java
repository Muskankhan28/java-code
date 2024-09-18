package stack;
import java.util.*;

public class nextgreatestleft {
    public static int[] nextgreatestleft(int arr[]){
        int n = arr.length;
        int nextgreatestleft[] = new int[n];
        Stack<Integer>s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextgreatestleft[i] = -1;
            }
            else{
                nextgreatestleft[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return nextgreatestleft;
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int result[] = nextgreatestleft(arr);
        for (int i : result) {
            System.out.print(i+ " ");
        }
    }
}
