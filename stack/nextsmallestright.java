package stack;
import java.util.*;

public class nextsmallestright {
    public static int[] nextsmallestintheright(int arr[]){
        int n = arr.length;
        int nextsmallest[] = new int[n];
        Stack<Integer>s = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextsmallest[i] = -1;
            }
            else{
                nextsmallest[i] =arr[s.peek()];
            }
            s.push(i);
        }
        return nextsmallest;
    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int result[] = nextsmallestintheright(arr);
        for (int i : result) {
            System.out.print(i+ " ");
            
        }
    }
    
}
