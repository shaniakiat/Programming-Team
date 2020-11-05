class MyLinkedList {
    
    class Node {
        public int val;
        public Node next;
        public Node(int val) { 
            this.val = val; 
            this.next = null; 
        }
        public Node(int val, Node next) { 
            this.val = val; 
            this.next = next; 
        }
    }

    private Node head;
    private Node tail;
    private int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
        
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int result = -1;
        Node cur = this.head;
        if(index > this.size){
            return result;
        }
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }
        return cur.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node cur = new Node(val, this.head);
        this.head = cur;
        if(this.size == 0){
            this.tail = cur;
        }
        this.size = this.size + 1;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node cur = new Node(val);
        this.tail.next = cur;
        this.size = this.size + 1;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index == 0){
            Node cur = new Node(val, this.head);
            this.head = cur;
            this.size = this.size + 1;
        } else if(index == this.size){
            Node cur = new Node(val);
            this.tail.next = cur;
            this.size = this.size + 1;
        } else if(index < this.size){
            Node prev = this.head;
            Node next = this.head;
            Node cur = new Node(val);
            for(int i = 0; i < index; i++){
                prev = next;
                next = next.next;
            }
            prev.next = cur;
            cur.next = next;
            this.head = prev;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index == 0){
            this.head = head.next;
            this.size = this.size - 1;
        } else if(index == this.size){
            this.tail = null;
            this.size = this.size - 1;
        } else if(index < this.size){
            Node cur = this.head;
            for(int i = 0 ; i < index-1; i++){
                cur = cur.next;
            }
            Node next = cur.next.next;
            cur.next = next;
            this.head = cur;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */