package geeks;

public class countdigits {
    public static int count(int x){
        int count = 0;
        while(x>0){
            x=x/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int x = 923579798;
        System.out.println(count(x));
    }
}
