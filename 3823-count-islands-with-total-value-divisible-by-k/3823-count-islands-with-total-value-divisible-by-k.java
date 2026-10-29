class Solution {
    int n,m;
    public long dfs(int[][] grid, int i,int j){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0) return 0;
        long ans = grid[i][j];
        grid[i][j] = 0;
        return ans + dfs(grid,i+1,j) + dfs(grid,i-1,j) + dfs(grid,i,j+1) + dfs(grid,i,j-1);
    }
    public int countIslands(int[][] grid, int k) {
        n = grid.length;
        m = grid[0].length;
        int res = 0;
        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]!=0){
                    long val = dfs(grid,i,j);
                    if(val%k==0) res++;
                }
            }
        }
        return res;
    }
}