package geeks;

public class alldivisor {
    public static void printalldivisor(int n){
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int n = 7;
        printalldivisor(n);
    }
    
}
