package greedy;

public class optimialPartationOfString {
    public static int partationString(String s){
        int n = s.length();
        int lastseen[] = new int[26];
        for(int i=0;i<lastseen.length;i++){
            lastseen[i] = -1;
        }
        int count = 0;
        int startSubString = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(lastseen[ch-'a']>=startSubString){
                count++;
                startSubString=i;
            }
            lastseen[ch-'a'] = i;
        }
        return count+1;
    }
    public static void main(String[] args) {
        String s = "abacaba";
        int ans = partationString(s);
        System.out.println(ans);
    }
    
}
