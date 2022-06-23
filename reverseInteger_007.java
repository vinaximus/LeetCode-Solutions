public class reverseInteger_007 {
    public static int reverse(int x) {
        int ans=0;
        int sign;
        if (x<0) sign=-1; else sign=1;
        while (x!=0) {
            int cur=x % 10;
            if (x<0) {
                if (ans<Integer.MIN_VALUE/10 || ans==Integer.MIN_VALUE/10 && cur<Integer.MIN_VALUE%10 ) return 0;
            } else if (x>0) {
                if (ans>Integer.MAX_VALUE/10 || ans==Integer.MAX_VALUE/10 && cur>Integer.MAX_VALUE%10 ) return 0;
            }
            ans=(ans*10)+cur;
            x=x/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int m=-1463847412;
        System.out.println(reverse(m));
    }
}