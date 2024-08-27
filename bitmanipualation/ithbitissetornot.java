package bitmanipualation;

public class ithbitissetornot {
    public static boolean isthebitsetornot(int n ,  int i){
        return ((n&(1<<i)) !=0);
    }
    public static void main(String[] args) {
        int n = 13;
        int i=1;
        System.out.println(isthebitsetornot(n, i));
    }
}
