class Node{
    int val;
    Node next;
    public Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
}
class MyCircularQueue {
    Node head;
    int n, size;
    public MyCircularQueue(int k) {
        size = k;
        head = null;
        n = 0;
    }
    
    public boolean enQueue(int value) {
        if(n==size) return false;
        Node node = new Node(value,null);
        if(head == null){
            head = node;
            head.next = head;
        }
        else {
            node.next = head;
            Node temp = head;
            do{
                temp = temp.next;
            }while(temp.next!=head);
            temp.next = node;
        }
        n++;
        return true;
    }
    
    public boolean deQueue() {
        if(n==0) return false;
        Node temp = head;
        do{
            temp = temp.next;
        }while(temp.next!=head);
        if(head == temp){
            head = null;
        }else{
            head = head.next;
            temp.next = head;
        }
        n--;
        return true;
    }
    
    public int Front() {
        if(n==0) return -1;
        return head.val;
    }
    
    public int Rear() {
        if(n==0) return -1;
        Node temp = head;
        do{
            temp = temp.next;
        }while(temp.next!=head);
        return temp.val;
    }
    
    public boolean isEmpty() {
        return n==0;
    }
    
    public boolean isFull() {
        return n==size; 
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */