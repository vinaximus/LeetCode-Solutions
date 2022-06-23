class Solution {
    public static int myAtoi(String s) {
        
        if (s.length()==0) return 0;
        int c=0; // current char
        boolean isNegative=false;
        int ans=0;
        
        while (c<s.length() && s.charAt(c)==32 ) c++; //Remove leading white spaces
        if (c>=s.length()) return 0; //invalid String
        if (s.charAt(c)=='-') {
            isNegative=true;
            c++;
        } else if (s.charAt(c)=='+') {
            c++;
        }
        if (c>=s.length() || s.charAt(c)<48 || s.charAt(c)>57) return 0;
        
        int d;
        while (c<s.length() && s.charAt(c)>=48 && s.charAt(c)<=57) {
            d=s.charAt(c)-48;
            if (ans<Integer.MAX_VALUE/10 || ans==Integer.MAX_VALUE/10 && Integer.MAX_VALUE % 10>=d) {
                ans=(ans*10)+d;
                c++;
            } else {
                if (isNegative)ans=Integer.MIN_VALUE; else ans=Integer.MAX_VALUE;
                break;
            }
            
            
        }
        if (isNegative) return ~ans+1; else return ans;
    }   
    
    public static void main(String[] args) {
        System.out.println(myAtoi("2147483646"));
    }
}
