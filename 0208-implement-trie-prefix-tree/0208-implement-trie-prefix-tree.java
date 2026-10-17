class Node{
    boolean isEnd = false;
    Node[] children = new Node[26];
}
class Trie {
    Node root = new Node();
    public Trie() {
        
    }
    
    public void insert(String word) {
        Node temp = root;
        for(char ch:word.toCharArray()){
            int i = ch-'a';
            if(temp.children[i]==null) temp.children[i] = new Node();
            temp = temp.children[i];
        }
        temp.isEnd = true;
    }
    
    public boolean search(String word) {
        Node temp = root;
        for(char ch:word.toCharArray()){
            int i = ch-'a';
            if(temp.children[i]==null) return false;
            temp = temp.children[i];
        }
        return temp.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        Node temp = root;
        int cnt = 0;
        for(char ch:prefix.toCharArray()){
            int i = ch-'a';
            if(temp.children[i]==null) return false;
            cnt++;
            temp = temp.children[i];
        }
        return cnt == prefix.length();
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */