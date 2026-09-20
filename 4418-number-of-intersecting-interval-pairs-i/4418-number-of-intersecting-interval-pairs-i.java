class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        int n = intervals.length;
        int cnt = 0;
        Arrays.sort(intervals,(a,b)-> { return a[0] - b[0];});
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(intervals[i][0] <= intervals[j][1])cnt++;
            }
        }
        return cnt;
    }
}