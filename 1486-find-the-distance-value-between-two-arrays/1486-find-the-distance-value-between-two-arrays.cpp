class Solution {
public:
    int closest(vector<int> a, int x){
        int low  = 0, high = a.size()-1;
        while(low<high-1){
            int mid = (low+high)/2;
            if(a[mid] == x) return a[mid];
            else if(x > a[mid]) low = mid;
            else high = mid;
        }
        int d1 = x - a[low];
        int d2 = a[high] - x;
        if(d1 < d2) return a[low];
        return a[high];
    }
    int findTheDistanceValue(vector<int>& arr1, vector<int>& arr2, int d) {
        sort(arr2.begin(), arr2.end());
        int cnt = 0;
        for(int i=0;i<arr1.size();i++){
            if(abs(closest(arr2,arr1[i]) - arr1[i]) > d) cnt++;
        }
        return cnt;
    }
};