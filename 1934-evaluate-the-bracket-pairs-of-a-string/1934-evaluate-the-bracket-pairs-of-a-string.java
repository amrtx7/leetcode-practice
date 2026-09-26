class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> mp = new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            String key = knowledge.get(i).get(0);
            String val = knowledge.get(i).get(1);
            mp.put(key,val);
        }
        StringBuilder res = new StringBuilder();
        int n = s.length();
        int i=0;
        while(i<n){
            char ch = s.charAt(i);
            if(ch=='('){
                i++;
                StringBuilder tempKey = new StringBuilder();
                while(s.charAt(i)!=')') tempKey.append(s.charAt(i++));
                String tempKeyStr = tempKey.toString();
                if(mp.containsKey(tempKeyStr)) res.append(mp.get(tempKeyStr));
                else res.append('?');

            }else res.append(ch);
            i++;
        }
        return res.toString();
    }
}