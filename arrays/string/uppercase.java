package arrays.string;

public class uppercase {
    public static String convertToUpperCase(String s){
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        char ch = Character.toUpperCase(s.charAt(0));
        sb.append(ch);
        for(int i=1;i<n;i++){
            if(s.charAt(i) == ' '  &&  i<s.length()-1){
                i++;
                sb.append(s.charAt(i));
                sb.append(Character.toUpperCase(s.charAt(i))); 
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "hi, i am muskan";
        System.out.println(convertToUpperCase(s));
    }
    
}
