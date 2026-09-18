class Solution {
    public int minBitFlips(int start, int goal) {
        // first approach
        int dist = 0;
        // while(start!=0 || goal!=0){
        //     int k1 = start%2;
        //     int k2 = goal%2;
        //     if(k1!=k2) dist++;
        //     start /= 2;
        //     goal /= 2;
        // }
        int xor = start^goal;
        while(xor!=0){
            dist += xor&1;
            xor >>= 1;
        }
        return dist;
    }
}