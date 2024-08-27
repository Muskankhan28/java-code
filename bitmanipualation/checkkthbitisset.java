package bitmanipualation;

public class checkkthbitisset {
    public static boolean iskthbitisset(int n , int k){
        if((n&1) != 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n=5;
        int k=1;
        System.out.println(iskthbitisset(n, k));
    }
    
}
