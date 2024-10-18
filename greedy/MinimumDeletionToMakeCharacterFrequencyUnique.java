package greedy;
import java.util.*;

public class MinimumDeletionToMakeCharacterFrequencyUnique {
    public static int minimumDeletion(String s){
        int n = s.length();
        HashSet<Integer>set = new HashSet<>();
        int freq[] = new int[26];
        for(int i=0;i<freq.length;i++){
            freq[i] = 0;
        }
        // calculating the number of frequency of each character
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        int deletion = 0;
        for(int i=0;i<freq.length;i++){
            while(freq[i]>0 && set.contains(freq[i])){
                freq[i]--;
                deletion++;
            }
            set.add(freq[i]);
        }
        return deletion;

    }
    public static void main(String[] args) {
        String s = "aaabbbcc";
        int ans = minimumDeletion(s);
        System.out.println(ans);
    }
    
}
