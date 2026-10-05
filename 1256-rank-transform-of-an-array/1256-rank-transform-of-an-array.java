class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        int rank=1;
        while(!pq.isEmpty()){
            int num = pq.poll();
            if(mp.getOrDefault(num,0)==0){
                mp.put(num,rank++);

            }
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Rank : "+mp.get(arr[i]));
            res[i] = mp.get(arr[i]);
        }
        return res;
    }
}