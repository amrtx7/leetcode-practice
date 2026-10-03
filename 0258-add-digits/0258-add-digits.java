class Solution {
    public int addDigits(int num) {
        if(num < 10) return num;
        int ans = num%10 + addDigits(num/10);
        if(ans<10) return ans;
        return addDigits(ans);
    }
}