package arrays;

public class factorial {
    public static int findfactorial(int n){
        int fac =1;
        for(int i=2;i<=n;i++){
            fac = fac * i;
        }
        return fac;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(findfactorial(n));

        
    }
    
}
