/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        int n = 0;
        ListNode curr = head;
        ListNode prev =null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            n++;
        }
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        ListNode temp = prev;
        int i=0;
        while(temp!=null){
            while(!st.empty() && st.peek()<=temp.val) st.pop();
            if(st.empty()) res[n-i-1] = 0;
            else res[n-i-1] = st.peek();
            st.push(temp.val);
            i++;
            temp = temp.next;
        }
        return res;
    }
}