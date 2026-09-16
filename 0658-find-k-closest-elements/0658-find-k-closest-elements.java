class Solution {
    class Pair{
        int n,dist;
        Pair(int n, int d){
            this.n = n;
            this.dist = d;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b)->{
                if(a.dist!=b.dist) return a.dist - b.dist;
                return a.n - b.n;
            }
        );
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            pq.add(new Pair(arr[i],Math.abs(arr[i]-x)));
        }
        while(k-->0 && !pq.isEmpty()) res.add(pq.poll().n);
        Collections.sort(res);
        return res;

    }
}