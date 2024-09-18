package stack;
import java.util.*;
public class nextgreatestrightoptimisedapproach {
    // next greatest right
    // time complexity -> 0(n)
    public static int[] nextgreatest(int arr[]){
        int n = arr.length;
        int nextGreatest[] = new int[n];
        Stack<Integer>s = new Stack<>();
        for(int i=n-1;i>=0;i--){
            // while loop
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            // if else check
            if(s.isEmpty()){
                nextGreatest[i] = -1;
            }
            else{
                nextGreatest[i] = arr[s.peek()];
            }
            // push index in the stack
            s.push(i);
        }
        return nextGreatest;
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int ans[] = nextgreatest(arr);
        for (int i : ans) {
            System.out.print(i+ " ");
        }
    } 
} 
