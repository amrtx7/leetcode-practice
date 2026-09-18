class Solution {
    public int minFlips(int a, int b, int c) {
        int cnt = 0;
        while(a!=0 || b!=0 || c!=0){
            int a1 = a&1;
            int b1 = b&1;
            int c1 = c&1;
            int sum = a1 + b1;
            if(sum==2){
                if(c1==0) cnt+=2;
            }
            else if(sum==1){
                if(c1==0) cnt++;
            }
            else{
                if(c1==1) cnt++;
            }
            a>>=1;
            b>>=1;
            c>>=1;
        }
        return cnt;
    }
}