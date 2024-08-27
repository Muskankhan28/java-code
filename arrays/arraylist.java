package arrays;
import java.util.*;

public class arraylist {
    public static void swap(ArrayList<Integer>list,int indx1, int indx2){
        for(int i=0;i<list.size();i++){
            int temp = list.get(indx1);
            list.set(indx1,list.get(indx2));
            list.set(indx2,temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        // list.add(1);
        // list.add(8);
        // list.add(9);
        // list.add(99);
        // list.add(5);


        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);    
        int indx1 = 1;
        int indx2 = 3;

        System.out.print(list);
        System.out.println();

        swap(list, indx1, indx2);
        System.out.print(list);
        // for (Integer i : list) {
        //     System.out.print(i + " ");
            
        // }

        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i) + " ");
        // }
        

        
        
// print reverse arraylist
        
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i) + " ");
        // }



// print largest in an array list 

        // int largest = Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     if(list.get(i)>largest){
        //         largest = list.get(i);
        //     }
        // }
        // System.out.println(largest);
       


     


      

    }
    
}
