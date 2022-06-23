public class LongestSubString_003 {
    public static int lengthOfLongestSubstring(String s) {
        int pointer=0;
        int max=Integer.MIN_VALUE;
        for (int i=1;i<s.length();i++) {
            for (int j=i-1;j>=pointer;j--) {
                if (s.charAt(j)!=s.charAt(i)) {
                    if (max<Math.abs(j-i)) max=Math.abs(j-i);
                }
                else pointer=j+1;
                    
            }
        }
        return max;
        
    }
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}