package bitmanipualation;

public class togglebit {
    public static int togglethebits(int n , int i){
        return (n^(1<<i));
    }
    public static void main(String[] args) {
        int n=13;
        int i=2;
        System.out.println(togglethebits(n, i));
    }
    
}
