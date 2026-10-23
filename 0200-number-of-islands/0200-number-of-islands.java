class Solution {
    int cnt = 0;
    public void dfs(char[][] grid, int i,int j,int n, int m){
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]=='0') return;
        grid[i][j] = '0';
        dfs(grid,i+1,j,n,m);//top
        dfs(grid,i,j+1,n,m);//down
        dfs(grid,i-1,j,n,m);//left
        dfs(grid,i,j-1,n,m);//right
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    cnt++;
                    dfs(grid,i,j,n,m);  
                }
            }
        }
        return cnt;
    }
}