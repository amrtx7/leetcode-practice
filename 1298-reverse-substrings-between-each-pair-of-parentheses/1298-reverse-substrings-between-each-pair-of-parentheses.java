class Solution {
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i]; // Store the value at index i
        arr[i] = arr[j];    // Assign the value at index j to index i
        arr[j] = temp;      // Assign the stored temp value to index j
    }
    public void reverseStr(char[] str, int start, int end){
        while(start<end){
            swap(str, start, end);
            start++;
            end--;
        }
    }
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        char[] chstr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(') st.push(i);
            else if(ch==')'){
                reverseStr(chstr, st.peek()+1, i-1);
                st.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:chstr) if(ch!='(' && ch!=')') sb.append(ch);
        return sb.toString();
    }
}