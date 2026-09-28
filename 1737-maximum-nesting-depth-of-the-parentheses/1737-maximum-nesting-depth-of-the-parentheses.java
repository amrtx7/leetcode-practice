class Solution {
    public int maxDepth(String s) {
        int cnt=0, maxCnt=0;
        for(char ch:s.toCharArray()){
            if(ch=='(') cnt++;
            maxCnt = Math.max(cnt, maxCnt);
            if(ch==')') cnt--;
        }
        return maxCnt;
    }
}