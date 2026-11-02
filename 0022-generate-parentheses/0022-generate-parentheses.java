class Solution {
    StringBuilder temp = new StringBuilder();
    public void solve(int n, int open, int close, List<String> res){
        if(open==n && close==n){
            res.add(temp.toString());
            return;
        }
        if(open<n){
            temp.append("(");
            solve(n,open+1,close,res);
            temp.deleteCharAt(temp.length()-1);
        }
        if(close < open){
            temp.append(")");
            solve(n,open, close+1,res);
            temp.deleteCharAt(temp.length()-1);
        }
        return;
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        int open = 0;
        int close = 0;
        solve(n,open,close,res);
        return res;
    }
}