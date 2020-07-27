class Solution {
    public int reverse(int x) {
        long ans = 0;
        int len = (int) (Math.log10(Math.abs(x)) + 1);
        for(int i = 1; i <= len; i++) {
            ans = (ans * 10) + (x % 10);
            x /= 10;
        }
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) ans;
    }
}
