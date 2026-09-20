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
    public int pairSum(ListNode head) {
        ListNode temp = head;
        Stack<ListNode> st = new Stack<>();
        while(temp.next != null){
            st.push(temp);
            temp = temp.next;
        }
        st.push(temp);
        int maxi = Integer.MIN_VALUE;
        temp = head;
        ListNode temp2 = st.pop();
        while(!st.isEmpty() && temp != temp2){
            maxi = Math.max(maxi,temp.val+temp2.val);
            temp2 = st.pop();
            temp = temp.next;
        }
        return maxi;
    }
}