package arrays;
import java.util.*;

public class containerwithmostwater {
    public static int containerwithmaximumwater(ArrayList<Integer>list){
        int maxwater = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int height = Math.min(list.get(i), list.get(j));
                int width =j-i;
                int currentwater = height*width;
             maxwater = Math.max(maxwater, currentwater);

            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int ans = containerwithmaximumwater(list);
        System.out.println("maximum water is - > " + ans);
        
    }

    
}
