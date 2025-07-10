


class LLDeleteFromLast {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //add in first
    public Node removeFromLast(int n) {
        if(head.next == null){
            return null;
        }
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(n == size){
            return head.next;
        }

        int indexToSearch = size - n;
        Node prev = head;
        int i = 1;
        while(i < indexToSearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;

    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //print data
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
        System.out.println("After deleting nth node from last:");
        int n = 2;
        list.removeFromLast(n);
        list.printList();

    }
}