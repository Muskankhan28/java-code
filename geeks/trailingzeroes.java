package geeks;

public class trailingzeroes {
    public static long countzeroes(int n){
        int fact = 1;
        for(int i=2;i<=n;i++){
            fact = fact*i;
        }
        int count = 0;
        while(fact % 10 == 0){
            count++;
            fact = fact/10;
        }
        return count;
    }


    public static void main(String[] args) {
        int n = 10;
        System.out.println(countzeroes(n));
    }
    
}
