class Solution {
    public int hammingDistance(int x, int y) {
        int dist = 0;
        while(x!=0 || y!=0){
            int k1 = x%2;
            int k2 = y%2;
            if(k1!=k2) dist++;
            x /= 2;
            y /= 2;
        }
        return dist;
    }
}