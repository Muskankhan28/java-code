package bitmanipualation;

public class sumofalldigit {
    public static int caldigitsum(int n){
        int sum = 0;
        while(n!=0){
            int lastdigit  = n%10;
            sum+=lastdigit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 23;
        int ans = caldigitsum(n);
        System.out.println(ans);
    }
    
}
