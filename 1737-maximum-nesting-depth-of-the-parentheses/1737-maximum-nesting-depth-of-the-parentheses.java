class Solution {
    public int maxDepth(String s) {
        int cnt=0, maxCnt=0;
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            cnt = Math.max(st.size(),cnt);
            if(ch == '(') st.push(ch);
            else if(ch==')') st.pop();
        }
        return cnt;
    }
}