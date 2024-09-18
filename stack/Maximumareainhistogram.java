package stack;
import java.util.*;

public class Maximumareainhistogram {

    public static int maximumArea(int arr[]){
        int maxArea = 0;
        int n = arr.length;
        int nextsmallerright[] = new int[n];
        int nextsmallerleft[] = new int[n];


        // Next Smaller Right
        Stack<Integer>s = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextsmallerright[i] = n;
            }
            else{
                nextsmallerright[i] = s.peek();
            }
            s.push(i);
        }
    
        // Next Smaller Left 

        s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextsmallerleft[i] = -1;
            }
            else{
                nextsmallerleft[i] = s.peek();
            }
            s.push(i);
        }
        
        // CurrentArea
        // width = j-i-1 = nextsmallerright[i]- nextsmallerleft[i]-1

        for(int i=0;i<n;i++){
            int height = arr[i];
            int width = nextsmallerright[i]-nextsmallerleft[i]-1;
            int currentArea = height*width;
            maxArea = Math.max(maxArea, currentArea);
        }
        return maxArea; 
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};         // hight of histogram
        System.out.println(maximumArea(arr));
    }
    
}
