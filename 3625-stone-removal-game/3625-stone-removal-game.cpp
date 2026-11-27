class Solution {
public:
    bool canAliceWin(int n) {
        if(n<10) return false;
        int i = 10;
        while(i>0){
            n-=i;
            if(n<0) return (i%2==0)?false:true;
            i--;
        }
        return true;
    }
};