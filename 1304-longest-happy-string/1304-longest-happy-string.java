class Solution {
    class Pair{
        char ch;
        int f;
        Pair(char ch, int f){
            this.ch = ch;
            this.f = f;
        }
    }
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (ax,bx)->{
                return bx.f - ax.f;
            }
        );
        if(a>0) pq.add(new Pair('a',a));
        if(b>0) pq.add(new Pair('b',b));
        if(c>0) pq.add(new Pair('c',c));
        String res = "";
        int i=0;
        while(!pq.isEmpty()){
            Pair first = pq.poll();
            if(i>=2 && (res.charAt(i-1)==first.ch && res.charAt(i-2)==first.ch)){
                // we cannt add
                if(pq.isEmpty()) break;
                Pair second = pq.poll();
                pq.add(first);
                res += second.ch;
                second.f--;
                i++;
                if(second.f>0) pq.add(second);
            }
            else{
                // we can add
                res += first.ch;
                first.f--;
                i++;
                if(first.f>0) pq.add(first);
            }
        }
        return res;
    }

}