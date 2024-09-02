package recrussions;

public class questions {
    public static void printnumberNto1(int n){
        if(n==0){
            return;
        }
        System.out.print(n+ " ");
        printnumberNto1(n-1);
    }

    public static void printnumber1toN(int n){
        

    }
    public static void main(String[] args) {
        // printnumberNto1(2);
        printnumber1toN(4);
        
    }
}
