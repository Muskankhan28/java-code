package geeks;

import java.util.Arrays;

public class sievealgo {

    public static void printalltheprimes(int n){
        if(n<=1){
            return;
        }
        boolean temp[] = new boolean[n+1];
        Arrays.fill(temp, true);
        for(int i=2;i*i<=n;i++){
            if(temp[i]){
                for(int j=i*2;j<=n;j=j+i){
                    temp[j] = false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(temp[i]){
                System.out.print(i + " ");
            }
        }
    }
   
    public static void main(String[] args) {
        int n = 6;
        printalltheprimes(n);
    }
}
