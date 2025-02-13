package greedy;
import java.util.*;

public class maxLengthChainOfPairs {
    public static void main(String[] args) {
        int pairs[][] = {{5,24},
                         {39,60},
                         {5,28},
                         {27,40},
                         {50,90}};


                         int chainlength = 0;
                         Arrays.sort(pairs , Comparator.comparingDouble(o->o[1]));
                         chainlength = 1;
                         int pairEnd = pairs[0][1];
                         for(int i=1;i<pairs.length;i++){
                            if(pairs[i][0] >= pairEnd){
                                chainlength++;
                                pairEnd = pairs[i][1];
                            }
                         }

                         System.out.println("Maximum length of chain " + " = " + chainlength);

                         
    }
    
}
