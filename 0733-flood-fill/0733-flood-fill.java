class Solution {
    public void solve(int[][] image, int r, int c, int i, int j, int color, int originalCol){
        if(i<0 || i>r-1 || j<0 || j>c-1 || image[i][j]==color || image[i][j]!=originalCol) 
            return;
        image[i][j] = color;
        solve(image,r,c,i-1,j,color, originalCol);
        solve(image,r,c,i+1,j,color, originalCol);
        solve(image,r,c,i,j-1,color, originalCol);
        solve(image,r,c,i,j+1,color, originalCol);
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int r = image.length;
        int c = image[0].length;
        int originalCol = image[sr][sc];
        solve(image,r,c,sr,sc,color,originalCol);
        return image;
    }
}