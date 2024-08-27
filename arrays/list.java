package arrays;
import java.util.*;

public class list {

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(89);
        list.add(99);
        list.add(12);
        list.add(10);
        list.add(95);
        list.add(69);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }

    
}
